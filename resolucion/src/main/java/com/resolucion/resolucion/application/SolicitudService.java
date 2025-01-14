package com.resolucion.resolucion.application;

import com.resolucion.resolucion.domain.Solicitud;
import com.resolucion.resolucion.infraestructure.repository.ISolicitudRepository;
import com.resolucion.resolucion.infraestructure.services.ISolicitudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudService implements ISolicitudService {

  @Autowired
  private ISolicitudRepository solicitudRepository;

  @Override
  public List<Solicitud> findSolicitudAll() {
    return (List<Solicitud>) solicitudRepository.findAll();
  }

  @Override
  public Solicitud saveSolicitud(Solicitud solicitud) {
    return solicitudRepository.save(solicitud);
  }

  @Override
  public void deleteSolicitud(Integer id_resolucion) {
    solicitudRepository.deleteById(id_resolucion);
  }

  @Override
  public Solicitud findSolicitudById(Integer id_resolucion) {
    return solicitudRepository.findById(id_resolucion).orElse(null);
  }

  @Override
  public Solicitud updateSolicitud(Solicitud solicitud) {
    return solicitudRepository.save(solicitud);
  }
}
