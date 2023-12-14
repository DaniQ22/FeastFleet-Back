package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.persistence.entity.Usuario;
import org.springframework.data.repository.ListCrudRepository;

public interface UsuarioCrud extends ListCrudRepository<Usuario, String> {
}
