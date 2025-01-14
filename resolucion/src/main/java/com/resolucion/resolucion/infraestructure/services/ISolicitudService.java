package com.resolucion.resolucion.infraestructure.services;

import com.resolucion.resolucion.domain.Solicitud;
import java.util.List;

public interface ISolicitudService {
  List<Solicitud> findSolicitudAll();

  Solicitud saveSolicitud(Solicitud solicitud);

  boolean deleteSolicitud(Integer id_solicitud);

  Solicitud findSolicitudById(Integer id_solicitud);

  Solicitud updateSolicitud(Solicitud solicitud);
}
