package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.User;
import com.FeastFleet.FeastFleet.domain.repository.UserRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.UsuarioCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Usuario;
import com.FeastFleet.FeastFleet.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements UserRepositoryInter {

    private final UsuarioCrud usuarioCrud;
    private final UserMapper userMapper;

    @Autowired
    public UserRepository(UsuarioCrud usuarioCrud, UserMapper userMapper) {
        this.usuarioCrud = usuarioCrud;
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getAll() {
        List<Usuario> usuarios = usuarioCrud.findAll();
        return userMapper.toUser(usuarios);
    }

    @Override
    public User save(User user) {
        Usuario usuario = userMapper.toUsuario(user);
        return userMapper.toUser(usuarioCrud.save(usuario));
    }

    @Override
    public Optional<User> getByID(String id) {
        return usuarioCrud.findById(id).map(usuario -> userMapper.toUser(usuario));
    }

    @Override
    public void delete(String id) {
        usuarioCrud.deleteById(id);
    }


}
