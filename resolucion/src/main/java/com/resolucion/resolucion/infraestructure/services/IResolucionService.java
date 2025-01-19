package com.resolucion.resolucion.infraestructure.services;

import com.resolucion.resolucion.domain.Resolucion;
import com.resolucion.resolucion.domain.dto.resolucion.ResolucionDTO;
import com.resolucion.resolucion.domain.dto.resolucion.ResolucionSaveDTO;

import java.util.List;

public interface IResolucionService {
  List<Resolucion> findResolucionAll();

  Resolucion findResolucionById(Integer id_resolucion);

  Resolucion saveResolucion(Resolucion resolucion);

  boolean deleteResolucion(Integer id_resolucion);

  Resolucion updateResolucion(Resolucion resolucion);
}
