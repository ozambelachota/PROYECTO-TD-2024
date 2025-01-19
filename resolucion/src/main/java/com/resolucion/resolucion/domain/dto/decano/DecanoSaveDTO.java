package com.resolucion.resolucion.domain.dto.decano;

import lombok.Data;
import java.util.Date;

@Data
public class DecanoSaveDTO {
    private char estado;
    private Integer idResolucion;
    private Integer creadoUsuario;
    private Date creadoFecha;
    private Integer modificadoUsuario;
    private Date modificadoFecha;
    private Integer eliminacionUsuario;
    private Date eliminacionFecha;
}
