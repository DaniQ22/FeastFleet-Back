package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.persistence.entity.Resena;
import com.FeastFleet.FeastFleet.persistence.entity.ResenaPk;
import org.springframework.data.repository.ListCrudRepository;

public interface ResenaCrud extends ListCrudRepository<Resena, ResenaPk> {


}
