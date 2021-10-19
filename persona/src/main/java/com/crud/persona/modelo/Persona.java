package com.crud.persona.modelo;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codsis;
    @Column(length = 20)
    private String nombre;
    @Column(length = 50)
    private String apellidos;
    @Column(length = 100)
    private String carrera;
    @Column(length = 10, unique=true)
    private String sexo;

    public Persona(){
        // TODO Auto-generated constructor stub
    }

    public Persona(int codsis, String nombre, String apellidos, String carrera, String sexo) {
        super();
        this.codsis = codsis;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.sexo = sexo;
    }

    public int getCodsis() {
        return codsis;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSexo() {
        return sexo;
    }

    public void setCodsis(int codsis) {
        this.codsis = codsis;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
