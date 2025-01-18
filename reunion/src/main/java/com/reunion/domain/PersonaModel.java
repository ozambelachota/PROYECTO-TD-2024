package com.reunion.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "persona")

public class PersonaModel {
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_persona;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni")
    private String dni;

    @Column(name = "correo")
    private String correo;

    @Column(name = "cargo")
    private String cargo;
    
    @Column(name = "estado")
    private char estado;
    
    @Column(name = "creado_usuario")
    private Integer creadoUsuario;

    @Column(name = "creado_fecha")
    private Date creadoFecha;
  
    @Column(name = "modificado_usuario")
    private Integer modificadoUsuario;
  
    @Column(name = "modificado_fecha")
    private Date modificadoFecha;
  
    @Column(name = "eliminacion_usuario")
    private Integer eliminacionUsuario;

    @Column(name = "eliminacion_fecha")
    private Date eliminacionFecha;
}
