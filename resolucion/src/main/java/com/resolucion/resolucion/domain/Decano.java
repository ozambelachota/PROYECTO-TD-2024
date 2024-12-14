package com.resolucion.resolucion.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "decano")
public class Decano {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idDecano;

  @Column(name = "estado")
  private char estado;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
  @JoinColumn(name = "id_resolucion", nullable = false)
  private Resolucion resolucion;

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
