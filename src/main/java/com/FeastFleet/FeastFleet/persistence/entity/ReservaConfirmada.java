package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reserva_confirmada")

public class ReservaConfirmada {

    @Id
    @Column(name = "id_reserva_confirmada")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservaConfirmadaId;
    @Column(name = "id_usuario")
    private String idUsuario;
    @Column(name = "id_restaurante")
    private String idRestaurante;
    @Column(name = "codigo_confirmacion")
    private Integer codigoConfirmacion;
    @Column(name = "fecha_confirmacion")
    private LocalDateTime fechaConfirmacion;



    public Integer getReservaConfirmadaId() {
        return reservaConfirmadaId;
    }

    public void setReservaConfirmadaId(Integer reservaConfirmadaId) {
        this.reservaConfirmadaId = reservaConfirmadaId;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public Integer getCodigoConfirmacion() {
        return codigoConfirmacion;
    }

    public void setCodigoConfirmacion(Integer codigoConfirmacion) {
        this.codigoConfirmacion = codigoConfirmacion;
    }

    public LocalDateTime getFechaConfirmacion() {
        return fechaConfirmacion;
    }

    public void setFechaConfirmacion(LocalDateTime fechaConfirmacion) {
        this.fechaConfirmacion = fechaConfirmacion;
    }
}
