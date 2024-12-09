package com.project.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class personaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_persona")
    public Integer id_persona;

    @Column(name="nombres")
    public String nombres;

    @Column(name="apellidos")
    public String apellidos;

    @Column(name="dni")
    public String dni;

    @Column(name="correo")
    public String correo;

    @Column(name="cargo")
    public String cargo;

    @Column(name="estado")
    public String estado;

    @Column(name="creadoUsuario")
    public Integer creadoUsuario;

    @Column(name="creadoFecha")
    public String creadoFecha;

    @Column(name="modificadoUsuario")
    public Integer modificadoUsuario;

    @Column(name="modificadoFecha")
    public String modificadoFecha;

    @Column(name="eliminacionUsuario")
    public Integer eliminacionUsuario;

    @Column(name="eliminacionFecha")
    public String eliminacionFecha; 
}
