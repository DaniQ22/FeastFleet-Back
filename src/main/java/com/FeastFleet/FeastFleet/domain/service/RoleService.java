package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Role;
import com.FeastFleet.FeastFleet.persistence.repositoryIMP.RoleRepository;
import com.FeastFleet.FeastFleet.web.message.MessageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements RoleServiceInter{

    private final RoleRepository repository;

    @Autowired
    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Role> getAll() {
        return repository.getAll();
    }

    @Override
    public Role save(Role role) {
        if (!role.getRoleName().isEmpty()
                || !role.getRoleName().equals("")){
            return repository.save(role);
        }else {
            throw new MessageException("Error, asegurate que los campos no esten vacidos");
        }
    }
}
