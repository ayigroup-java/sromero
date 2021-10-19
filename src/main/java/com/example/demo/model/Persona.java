package com.example.demo.model;

import org.springframework.data.annotation.Id;
import javax.persistence.Entity;

@Entity
public class Persona {

    @Id
    private String id;
    private String nombre;
    private String legajo;

    public Persona() {
    }

    public Persona(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setId(String id) {
        this.id = id;
    }

    @javax.persistence.Id
    public String getId() {
        return id;
    }
}