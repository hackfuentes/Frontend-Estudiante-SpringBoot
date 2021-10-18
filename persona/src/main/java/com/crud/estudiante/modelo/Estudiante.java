package com.crud.estudiante.modelo;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String name;
    @Column(length = 10, unique=true)
    private String telefono;

    public Estudiante(){
        // TODO Auto-generated constructor stub
    }

    public Estudiante(int id, String name, String telefono) {
        super();
        this.id = id;
        this.name = name;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
