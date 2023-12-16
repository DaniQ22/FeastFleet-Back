package com.FeastFleet.FeastFleet.domain.repository;

import com.FeastFleet.FeastFleet.domain.dto.Preference;
import com.FeastFleet.FeastFleet.persistence.entity.Preferencia;
import org.springframework.data.repository.ListCrudRepository;

import javax.naming.InsufficientResourcesException;
import java.util.List;
import java.util.Optional;

public interface PreferenceRepositoryInter {

    List<Preference> getAll();

    Preference save(Preference preference);

    void delete(Integer preferenceId);

    Optional<Preference> getById(Integer preferenceId);

}
