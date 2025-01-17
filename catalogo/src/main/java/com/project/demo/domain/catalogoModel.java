package com.project.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "catalago")
public class catalogoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalago")
    public Integer idCatalago;

    @Column(name = "tabla")
    public String tabla;

    @Column(name = "item")
    public String item;

    @Column(name = "descripcionLarga")
    public String descripcionLarga;

    @Column(name = "descripcionCorta")
    public String descripcionCorta;

    @Column(name = "estado")
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

