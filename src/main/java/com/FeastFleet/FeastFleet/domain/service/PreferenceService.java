package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Preference;
import com.FeastFleet.FeastFleet.persistence.repositoryIMP.PreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceService implements PreferenceServiceInter{
    private final PreferenceRepository repository;

    @Autowired
    public PreferenceService(PreferenceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Preference> getAll() {
        return repository.getAll();
    }
}
