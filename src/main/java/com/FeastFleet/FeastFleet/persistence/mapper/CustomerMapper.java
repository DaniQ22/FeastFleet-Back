package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.Customer;
import com.FeastFleet.FeastFleet.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mappings({
            @Mapping(source = "idCliente", target = "idCustomer"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "correoElectronico", target = "email"),
            @Mapping(source = "telefono", target = "phone"),
            @Mapping(source = "direccion", target = "address")

    })
    Customer toCustomer(Cliente cliente);
    @InheritInverseConfiguration
    Cliente toClient(Customer customer);

    List<Customer> toCustomer(List<Cliente> cliente);

}
