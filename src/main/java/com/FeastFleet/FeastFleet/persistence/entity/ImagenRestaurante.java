package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

@Entity
@Table(name = "imagen")
public class ImagenRestaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagen")
    private Integer idImagen;

    private String nombre;

    @Column(name = "tipo_contenido")
    private String tipoConteNido;

    @Column(name = "id_restaurante")
    private String idRestaurante;
    private byte[] datos;

    @ManyToOne
    @JoinColumn(name = "id_restaurante", insertable = false, updatable = false)
    private Restaurante restaurante;

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoConteNido() {
        return tipoConteNido;
    }

    public void setTipoConteNido(String tipoConteNido) {
        this.tipoConteNido = tipoConteNido;
    }

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public byte[] getDatos() {
        return datos;
    }

    public void setDatos(byte[] datos) {
        this.datos = datos;
    }
}
