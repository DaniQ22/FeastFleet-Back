package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "imagen")
public class ImagenRestaurante {

    @Id
    @Column(name = "id_imagen")
    private String urlImagenes;

    @Column(name="id_restaurante")
    private String idRestaurante;


    @ManyToOne
    @JoinColumn(name = "id_restaurante", insertable = false, updatable = false)
    private Restaurante restaurante;


    public String getUrlImagenes() {
        return urlImagenes;
    }

    public void setUrlImagenes(String urlImagenes) {
        this.urlImagenes = urlImagenes;
    }

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
