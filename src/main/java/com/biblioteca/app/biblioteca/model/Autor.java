package com.biblioteca.app.biblioteca.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "autores")
public class Autor extends Persona{


    private String pseudomino;
    private String biografia;

    public Autor(Long id, String nombre, String direccion, String dni, Date createdAt, Date updatedAt, String pseudomino, String biografia) {
        super(id, nombre, direccion, dni, createdAt, updatedAt);
        this.pseudomino = pseudomino;
        this.biografia = biografia;
    }

    public String getPseudomino() {
        return pseudomino;
    }

    public void setPseudomino(String pseudomino) {
        this.pseudomino = pseudomino;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
