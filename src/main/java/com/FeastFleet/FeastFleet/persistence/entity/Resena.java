package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "resena")
public class Resena {

    @EmbeddedId
    private ResenaPk idResena;

    private String comentario;

    private Double calificacion;


    public ResenaPk getIdResena() {
        return idResena;
    }

    public void setIdResena(ResenaPk idResena) {
        this.idResena = idResena;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

}
