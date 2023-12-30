package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurante_categoria")
public class RestauranteCategoria {

    @EmbeddedId
    private CategoriaRestaurantePk id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_restaurante", insertable = false, updatable = false)
    private Restaurante rest;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;


    public CategoriaRestaurantePk getId() {
        return id;
    }

    public void setId(CategoriaRestaurantePk id) {
        this.id = id;
    }

    public Restaurante getRest() {
        return rest;
    }

    public void setRest(Restaurante rest) {
        this.rest = rest;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
