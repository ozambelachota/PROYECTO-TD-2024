package com.resolucion.resolucion.domain.dto.decano;

import lombok.Data;

import java.util.Date;

@Data
public class DecanoDto {
    private Integer idDecano;
    private char estado;
    private Integer idResolucion; // Solo el ID de la relación
    private Integer creadoUsuario;
    private Date creadoFecha;
    private Integer modificadoUsuario;
    private Date modificadoFecha;
    private Integer eliminacionUsuario;
    private Date eliminacionFecha;
}
