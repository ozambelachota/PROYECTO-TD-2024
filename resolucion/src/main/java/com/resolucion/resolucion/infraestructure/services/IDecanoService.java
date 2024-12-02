package com.resolucion.resolucion.infraestructure.services;

import java.util.List;

import com.resolucion.resolucion.domain.Decano;

public interface IDecanoService {

  List<Decano> findDecanoAll();

  Decano saveDecano(Decano decano);

  boolean deleteDecano(Integer id_decano);

  Decano findDecanoById(Integer id_decano);

  Decano updateDecano(Decano decano);

  
}