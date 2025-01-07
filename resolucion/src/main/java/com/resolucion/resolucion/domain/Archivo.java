package com.resolucion.resolucion.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "archivo")
public class Archivo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id_archivo;

  @Column(name = "link")
  private String link;

  @Column(name = "naturaleza")
  private char naturaleza;

  @Column(name = "estado")
  private char estado;
  @Column(name = "creado_usuario", nullable = true)
  private Integer creadoUsuario;
  
  @Column(name = "creado_fecha", nullable = true)
  private Date creadoFecha;
  
  @Column(name = "modificado_usuario", nullable = true)
  private Integer modificadoUsuario;
  
  @Column(name = "modificado_fecha", nullable = true)
  private Date modificadoFecha;
  
  @Column(name = "eliminacion_usuario", nullable = true)
  private Integer eliminacionUsuario;
  
  @Column(name = "eliminacion_fecha", nullable = true)
  private Date eliminacionFecha;
}
