package com.resolucion.resolucion.domain.dto.resolucion;

import lombok.Data;

import java.util.Date;

@Data
public class ResolucionSaveDTO {
    private String codigo;
    private String titulo;
    private String tipo;
    private char estado;
    private Integer idArchivo;  // Solo el ID de la relación con Archivo
    private Integer idSolicitud; // Solo el ID de la relación con Solicitud
    private Integer creadoUsuario;
    private Date creadoFecha;
    private Integer modificadoUsuario;
    private Date modificadoFecha;
    private Integer eliminacionUsuario;
    private Date eliminacionFecha;
}
