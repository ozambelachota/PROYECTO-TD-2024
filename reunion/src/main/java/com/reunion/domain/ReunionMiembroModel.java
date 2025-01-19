package com.reunion.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()

@Table(name = "reunion_miembro")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReunionMiembroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reunion_miembro;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reunion", nullable = false)
    private ReunionConsejoModel reunionConsejo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona", nullable = false)
    private PersonaModel persona;

}
