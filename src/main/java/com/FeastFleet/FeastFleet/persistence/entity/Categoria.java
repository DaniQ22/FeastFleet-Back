package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer id;

    @Column(name = "nombre_categoria")
    private String nombre;

    private String descripcion;

    @OneToMany(mappedBy = "categoria")
    private List<RestauranteCategoria> restaurantes;


    public List<RestauranteCategoria> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<RestauranteCategoria> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
