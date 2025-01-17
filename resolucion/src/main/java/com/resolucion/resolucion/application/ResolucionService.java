package com.resolucion.resolucion.application;

import com.resolucion.resolucion.domain.Resolucion;
import com.resolucion.resolucion.infraestructure.repository.IResolucionRepository;
import com.resolucion.resolucion.infraestructure.services.IResolucionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResolucionService implements IResolucionService {

  @Autowired
  private IResolucionRepository resolucionRepository;

  @Override
  public List<Resolucion> findResolucionAll() {
    return (List<Resolucion>) resolucionRepository.findAll();
  }

  @Override
  public Resolucion findResolucionById(Integer id_resolucion) {
    return resolucionRepository.findById(id_resolucion).orElse(null);
  }

  @Override
  public Resolucion saveResolucion(Resolucion resolucion) {
    return resolucionRepository.save(resolucion);
  }

  @Override
  public boolean deleteResolucion(Integer id_resolucion) {
    var resolucion = resolucionRepository.findById(id_resolucion);
    if (resolucion.isPresent()) {
      resolucionRepository.deleteById(id_resolucion);
      return true;
    }
    return false;
  }

  @Override
  public Resolucion updateResolucion(Resolucion resolucion) {
    var resolucionDB = resolucionRepository.findById(resolucion.getId_resolucion());
    if (resolucionDB.isPresent()) {
      return resolucionRepository.save(resolucion);
    }
    return null;
  }
}
