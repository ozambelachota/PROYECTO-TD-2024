package com.resolucion.resolucion.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.resolucion.resolucion.domain.Resolucion;
import com.resolucion.resolucion.infraestructure.services.IResolucionService;

@Service
public class ResolucionService implements IResolucionService {

  @Override
  public List<Resolucion> findResolucionAll() {
    throw new UnsupportedOperationException("Unimplemented method 'findResolucionAll'");
  }

  @Override
  public Resolucion findResolucionById(Integer id_resolucion) {
    throw new UnsupportedOperationException("Unimplemented method 'findResolucionById'");
  }

  @Override
  public Resolucion saveResolucion(Resolucion resolucion) {
    throw new UnsupportedOperationException("Unimplemented method 'saveResolucion'");
  }

  @Override
  public void deleteResolucion(Integer id_resolucion) {
    throw new UnsupportedOperationException("Unimplemented method 'deleteResolucion'");
  }}

