package com.resolucion.resolucion.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.List;

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

  @OneToMany(
    mappedBy = "resolucion",
    cascade = CascadeType.ALL,
    orphanRemoval = true
  )
  private List<Resolucion> resolucions;

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
