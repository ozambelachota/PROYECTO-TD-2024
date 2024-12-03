package com.project.demo.model.usuarioModulo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    public Integer id_usuario;

    @Column(name="nombre_usuario")
    public String nombre_usuario;

    @Column(name="contraseña")
    public String contraseña;

    @Column(name="estado")
    public String estado;

    @Column(name="tipo")
    public String tipo;

    @Column(name="id_persona")
    public Integer id_persona;

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
