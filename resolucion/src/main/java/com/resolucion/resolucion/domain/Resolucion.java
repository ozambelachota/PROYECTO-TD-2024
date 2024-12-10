package com.resolucion.resolucion.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "resolucion")
@Data
public class Resolucion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id_resolucion;

  @Column(name = "codigo")
  private String codigo;

  @Column(name = "titulo")
  private String titulo;

  @Column(name = "tipo")
  private String tipo;

  @Column(name = "estado")
  private char estado;

  @ManyToOne
  @JoinColumn(name = "id_archivo", nullable = false)
  private Archivo archivo;

  @ManyToOne
  @JoinColumn(name = "id_solicitud", nullable = false)
  private Solicitud solicitud;

  @OneToMany(
    mappedBy = "resolucion",
    cascade = CascadeType.ALL,
    orphanRemoval = true
  )
  private List<Decano> decanos;

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
