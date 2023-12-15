package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reserva")

public class Reserva {

    @Id
    @Column(name = "id_reserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;
    @Column(name = "fecha_hora")
    private LocalDateTime fecha;
    @Column(name = "numero_comnsales")
    private Integer numeroComensales;

    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;


    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(Integer numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
