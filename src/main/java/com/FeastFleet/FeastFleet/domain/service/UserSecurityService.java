package com.FeastFleet.FeastFleet.domain.service;


import com.FeastFleet.FeastFleet.domain.repository.UserRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.entity.Rol;
import com.FeastFleet.FeastFleet.persistence.entity.Usuario;
import com.FeastFleet.FeastFleet.persistence.mapper.UserMapperr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSecurityService implements UserDetailsService {

   private final UserRepositoryInter userRepositoryInter;
   private final UserMapperr userMapper;

   @Autowired
    public UserSecurityService(UserRepositoryInter userRepositoryInter, UserMapperr userMapper) {
        this.userRepositoryInter = userRepositoryInter;
       this.userMapper = userMapper;
   }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = this.userRepositoryInter.getByID(username).map(userMapper::toUsuario)
                .orElseThrow(() -> new UsernameNotFoundException("User" + username + "not found"));

    String[] roles = usuario.getRoless().stream().map(Rol::getNombreRol).toArray(String[]::new);

        return User.builder()
                .username(usuario.getNombreUsuario())
                .password(usuario.getContraseña())
                .build();
    }

    private String[] getAuthorities(String role){
       if("Admin".equals(role)){
           return new String[]{"resturant_auth"};
       }
       return new String[]{};
    }

    private List<GrantedAuthority> grantedAuthorities(String[] roles){
       List<GrantedAuthority> authorities = new ArrayList<>(roles.length);

       for(String role: roles){
           authorities.add(new SimpleGrantedAuthority("ROLE_" + role));

           for (String authority: this.getAuthorities(role)){
               authorities.add(new SimpleGrantedAuthority(authority));
           }
       }
       return authorities;
    }

}
