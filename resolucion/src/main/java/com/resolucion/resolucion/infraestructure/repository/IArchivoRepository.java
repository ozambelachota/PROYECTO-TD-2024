package com.resolucion.resolucion.infraestructure.repository;

import com.resolucion.resolucion.domain.Archivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArchivoRepository extends CrudRepository<Archivo, Integer> {}
