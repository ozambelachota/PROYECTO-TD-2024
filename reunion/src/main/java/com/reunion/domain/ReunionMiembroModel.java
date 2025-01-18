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

@Entity()

@Table(name = "reunion_miembro")
public class ReunionMiembroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reunion_miembro;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reunion", nullable = false)
    private ReunionConsejoModel reunionConsejo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona", nullable = false)
    private PersonaModel persona;

}
