package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "restaurante")

public class Restaurante {

    @Id
    @Column(name = "id_restaurante")
    private String idRestaurante;
    private String nombre;
    @Column(name = "tipo_cocina")
    private String tipoCocina;
    private String direccion;
    private String descripcion;
    private Float calificacion;

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL)
    private List<ImagenRestaurante> imagenes;

    @OneToMany(mappedBy = "rest", cascade = CascadeType.ALL)
    private List<RestauranteCategoria> categorias;

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }

    public List<ImagenRestaurante> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<ImagenRestaurante> imagenes) {
        this.imagenes = imagenes;
    }

    public List<RestauranteCategoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<RestauranteCategoria> categorias) {
        this.categorias = categorias;
    }
}
