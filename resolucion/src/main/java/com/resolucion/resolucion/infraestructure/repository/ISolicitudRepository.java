package com.resolucion.resolucion.infraestructure.repository;

import com.resolucion.resolucion.domain.Solicitud;
import org.springframework.data.repository.CrudRepository;

public interface ISolicitudRepository
  extends CrudRepository<Solicitud, Integer> {}
