package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Preference;
import com.FeastFleet.FeastFleet.persistence.repositoryIMP.PreferenceRepository;
import com.FeastFleet.FeastFleet.web.message.MessageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Preference save(Preference preference) {
        return repository.save(preference);
    }

    @Override
    public void delete(Integer preferenceId) {
        Optional<Preference> preferenceToGet = getById(preferenceId);
        if (preferenceToGet.isPresent()){
            repository.delete(preferenceId);
        }else {
            throw new MessageException("La prefenrencia no existe");
        }
    }

    @Override
    public Optional<Preference> getById(Integer preferenceId) {
        return repository.getById(preferenceId);
    }
}
