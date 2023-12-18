package com.FeastFleet.FeastFleet.domain.service;


import com.FeastFleet.FeastFleet.domain.repository.UserRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.entity.Usuario;
import com.FeastFleet.FeastFleet.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserSecurityService implements UserDetailsService {

   private final UserRepositoryInter userRepositoryInter;
   private final UserMapper userMapper;

   @Autowired
    public UserSecurityService(UserRepositoryInter userRepositoryInter, UserMapper userMapper) {
        this.userRepositoryInter = userRepositoryInter;
       this.userMapper = userMapper;
   }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = this.userRepositoryInter.getByID(username).map(userMapper::toUsuario)
                .orElseThrow(() -> new UsernameNotFoundException("User" + username + "not found"));



        return null;
    }
}
