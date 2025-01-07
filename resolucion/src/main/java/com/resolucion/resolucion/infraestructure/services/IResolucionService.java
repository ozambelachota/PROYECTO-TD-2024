package com.resolucion.resolucion.infraestructure.services;

import com.resolucion.resolucion.domain.Resolucion;
import java.util.List;

public interface IResolucionService {
  public List<Resolucion> findResolucionAll();

  public Resolucion findResolucionById(Integer id_resolucion);

  public Resolucion saveResolucion(Resolucion resolucion);

  public void deleteResolucion(Integer id_resolucion);
}
