package com.resolucion.resolucion.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Service;

import com.resolucion.resolucion.domain.Decano;
import com.resolucion.resolucion.infraestructure.repository.IDecanoRepository;
import com.resolucion.resolucion.infraestructure.services.IDecanoService;

@Service
public class DecanoService implements IDecanoService {

  @Autowired
  private IDecanoRepository decanoRepository;

  @Override
  public List<Decano> findDecanoAll() {
  
    return (List<Decano>) decanoRepository.findAll();
  }

  @Override
  public Decano saveDecano(Decano decano) {

    return decanoRepository.save(decano);
  }

  @Override
  public boolean deleteDecano(Integer id_decano) {
    var decano = decanoRepository.findById(id_decano);
    if (decano.isPresent()) {
      decanoRepository.deleteById(decano.get().getIdDecano());
      return  true;
    }
    return false;
  }

  @Override
  public Decano findDecanoById(Integer id_resolucion) {

    return decanoRepository.findById(id_resolucion).orElse(null);
  }

  @Override
  public Decano updateDecano(Decano decano) {
    var decanoUpdate = decanoRepository.findById(decano.getIdDecano());
    if (decanoUpdate.isPresent()) {
      return decanoRepository.save(decano);
    }
    return null;
  }
}
