package com.biblioteca.app.biblioteca.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario extends Persona{

    private String nombreUsuario;
    private String contrasena;

    public Usuario(Long id, String nombre, String direccion, String dni, Date createdAt, Date updatedAt, String user, String contrasena) {
        super(id, nombre, direccion, dni, createdAt, updatedAt);
        this.nombreUsuario = user;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
