package com.resolucion.resolucion.domain;

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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "decano")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Decano {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idDecano;

  @Column(name = "estado")
  private char estado;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_resolucion", nullable = false)
  private Resolucion resolucion;

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
