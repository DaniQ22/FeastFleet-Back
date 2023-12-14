package com.FeastFleet.FeastFleet.domain.repository;

import com.FeastFleet.FeastFleet.domain.dto.Preference;
import com.FeastFleet.FeastFleet.persistence.entity.Preferencia;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PreferenceRepositoryInter {

    List<Preference> getAll();

}
