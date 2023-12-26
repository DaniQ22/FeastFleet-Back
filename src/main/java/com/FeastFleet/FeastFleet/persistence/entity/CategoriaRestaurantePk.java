package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class CategoriaRestaurantePk implements Serializable {

    @Column(name = "id_restaurante")
    private String restaurante;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}
