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
    @Column(name = "id_reserva")
    private Integer idReserva;
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

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
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
