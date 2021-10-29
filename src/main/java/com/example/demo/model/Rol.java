package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rol_id;
    private String rol_name;

    /*
    @ManyToMany
    @JoinTable(
            name = "rol_id",
            joinColumns = @JoinColumn(name = "posicion_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id"))
    Set<Posicion> posicionSet;
     */

}
