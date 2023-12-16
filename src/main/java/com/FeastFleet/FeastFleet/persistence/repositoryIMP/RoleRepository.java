package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Role;
import com.FeastFleet.FeastFleet.domain.repository.RoleRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.RolCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Rol;
import com.FeastFleet.FeastFleet.persistence.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RoleRepository implements RoleRepositoryInter {

    private  final RoleMapper mapper;
    private  final RolCrud rolCrud;

    @Autowired
    public RoleRepository(RoleMapper mapper, RolCrud rolCrud) {
        this.mapper = mapper;
        this.rolCrud = rolCrud;
    }


    @Override
    public List<Role> getAll() {
        List rols = rolCrud.findAll();
        return mapper.toRoles(rols);
    }

    @Override
    public Role save(Role role) {
        Rol rol = mapper.toRol(role);
        return mapper.toRole(rolCrud.save(rol));
    }

    @Override
    public void delete(Integer roleId) {
        rolCrud.deleteById(roleId);
    }

    @Override
    public Optional<Role> getById(Integer roleId) {
        Optional<Rol> rolOptional = rolCrud.findById(roleId);
        return rolOptional.map(rol -> mapper.toRole(rol));
    }
}
