package com.solicitud.solicitud.infraestructure.Services;

import com.solicitud.solicitud.domain.Solicitud;

import java.util.List;

public interface ISolicitudService {
    List<Solicitud> getAllSolicitudes();
    Solicitud getByIdSolicitud(String id);
    Solicitud saveSolicitud(Solicitud newSolicitud);
    Solicitud updateSolicitud(Solicitud solicitud);
    boolean deleteSolicitud(String id);

}
