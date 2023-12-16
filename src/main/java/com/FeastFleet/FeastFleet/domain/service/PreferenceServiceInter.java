package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Preference;
import com.FeastFleet.FeastFleet.domain.repository.PreferenceRepositoryInter;

import java.util.List;
import java.util.Optional;

public interface PreferenceServiceInter {
    List<Preference> getAll();

    Preference save(Preference preference);

    void delete(Integer preferenceId);

    Optional<Preference> getById(Integer preferenceId);
}
