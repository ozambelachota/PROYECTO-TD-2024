package com.reunion.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "reunion_consejo")
public class ReunionConsejoModel {
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_reunion;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "tema")
    private String tema;
    
    @Column(name = "tipo")
    private String tipo;

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
