package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Preference;
import com.FeastFleet.FeastFleet.domain.repository.PreferenceRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.PreferenciaCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Preferencia;
import com.FeastFleet.FeastFleet.persistence.mapper.PreferenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PreferenceRepository implements PreferenceRepositoryInter {

    private final PreferenceMapper mapper;

    private final PreferenciaCrud crud;

    @Autowired
    public PreferenceRepository(PreferenceMapper mapper, PreferenciaCrud crud) {
        this.mapper = mapper;
        this.crud = crud;
    }


    @Override
    public List<Preference> getAll() {
        List prefences = crud.findAll();
        return mapper.toPreference(prefences);
    }
}
