package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.persistence.entity.Restaurante;
import feign.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestauranteCrud extends ListCrudRepository<Restaurante, String> {
    @Query(value = "SELECT * FROM Restaurante  re INNER JOIN restaurante_categoria resca  ON re.id_restaurante = resca.id_restaurante INNER JOIN categoria ca ON ca.id_categoria = resca.id_categoria", nativeQuery = true)
    List<Restaurante> getAllRestautan();


}
