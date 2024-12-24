package com.resolucion.resolucion.infraestructure.repository;

import com.resolucion.resolucion.domain.Resolucion;
import org.springframework.data.repository.CrudRepository;

public interface IResolucionRepository
  extends CrudRepository<Resolucion, Integer> {}
