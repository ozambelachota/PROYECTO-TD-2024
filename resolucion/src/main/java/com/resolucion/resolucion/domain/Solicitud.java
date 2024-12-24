package com.resolucion.resolucion.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Entity
@Table(name = "solicitud")
@Data
public class Solicitud {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id_resolucion;

  @Column(name = "fecha")
  private Date fecha;

  @Column(name = "comentarios")
  private String comentario;

  @Column(name = "estado")
  private String estado;

  @Column(name = "fase")
  private String fase;

  @Column(name = "tipo")
  private String tipo;

  @Column(name = "creado_usuario")
  private Integer creadoUsuario;

  @OneToMany
  private List<Resolucion> resolucions;

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
