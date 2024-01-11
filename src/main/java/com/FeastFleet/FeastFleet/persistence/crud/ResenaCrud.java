package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.persistence.entity.Resena;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ResenaCrud extends ListCrudRepository<Resena, Integer> {

    @Query(value = "Select * from resena rese WHERE rese.id_restaurante = :idRestaurante", nativeQuery = true)
    List<Resena> getReviewsByRestaurant(@Param("idRestaurante") String idRestaurante);

    @Query(value = "Select * from resena  rese WHERE rese.id_cliente = :customerId", nativeQuery = true)
    List<Resena> getReviewByCustimer(@Param("customerId") String customerId);
}
