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
  public boolean deleteSolicitud(Integer id_solicitud) {
    var solicitud = solicitudRepository.findById(id_solicitud);
    if (solicitud.isPresent()) {
      solicitudRepository.deleteById(id_solicitud);
      return true;
    }

    return  false;
  }

  @Override
  public Solicitud findSolicitudById(Integer id_solicitud) {
    return solicitudRepository.findById(id_solicitud).orElse(null);
  }

  @Override
  public Solicitud updateSolicitud(Solicitud solicitud) {
    var solicitudDB = solicitudRepository.findById(solicitud.getId_resolucion());
    if (solicitudDB.isPresent()) {
      return solicitudRepository.save(solicitud);
    }
    return null;
  }
}
