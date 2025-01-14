package com.resolucion.resolucion.infraestructure.services;

import java.util.List;

import com.resolucion.resolucion.domain.Decano;

public interface IDecanoService {

  public List<Decano> findDecanoAll();

  public Decano saveDecano(Decano decano);

  public void deleteDecano(Integer id_resolucion);

  public Decano findDecanoById(Integer id_resolucion);

  public Decano updateDecano(Decano decano);

  
}
