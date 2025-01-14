package com.resolucion.resolucion.infraestructure.repository;

import com.resolucion.resolucion.domain.Decano;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDecanoRepository extends CrudRepository<Decano, Integer> {}
