package com.resolucion.resolucion.infraestructure.services;

import com.resolucion.resolucion.domain.Solicitud;
import java.util.List;

public interface ISolicitudService {
  public List<Solicitud> findSolicitudAll();

  public Solicitud saveSolicitud(Solicitud solicitud);

  public void deleteSolicitud(Integer id_resolucion);

  public Solicitud findSolicitudById(Integer id_resolucion);

  public Solicitud updateSolicitud(Solicitud solicitud);
}
