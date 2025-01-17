package com.resolucion.resolucion.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "solicitud")
@Data
@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor 
public class Solicitud {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id_resolucion;

  @Column(name = "fecha", nullable = false)
  private Date fecha;

  @Column(name = "comentario", nullable = false)
  private String comentario;

  @Column(name = "estado", nullable = false)
  private String estado;

  @Column(name = "fase", nullable = false)
  private String fase;

  @Column(name = "tipo", nullable = false)
  private String tipo;

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
