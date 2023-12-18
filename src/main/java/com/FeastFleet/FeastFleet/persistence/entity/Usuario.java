package com.FeastFleet.FeastFleet.persistence.entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    private String contraseña;
/*
    @Column(name = "id_cliente")
    private String idCliente;     */
    @OneToMany(mappedBy = "usuario", cascade = {CascadeType.ALL})
    private List<Rol> roless;


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
/*
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
*/
    public List<Rol> getRoless() {
        return roless;
    }

    public void setRoless(List<Rol> roless) {
        this.roless = roless;
    }
}
