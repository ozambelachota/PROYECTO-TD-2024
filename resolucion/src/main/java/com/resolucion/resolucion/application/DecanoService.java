package com.resolucion.resolucion.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
  public void deleteDecano(Integer id_resolucion) {

    decanoRepository.deleteById(id_resolucion);
  }

  @Override
  public Decano findDecanoById(Integer id_resolucion) {

    return decanoRepository.findById(id_resolucion).orElse(null);
  }

  @Override
  public Decano updateDecano(Decano decano) {

    return decanoRepository.save(decano);
  }}
