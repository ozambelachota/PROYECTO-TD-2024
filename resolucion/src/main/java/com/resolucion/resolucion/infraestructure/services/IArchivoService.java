package com.resolucion.resolucion.infraestructure.services;

import java.util.List;

import com.resolucion.resolucion.domain.Archivo;

public  interface IArchivoService {

  public List<Archivo> findArchivoAll();

  public Archivo findArchivoById(Integer id_archivo);

  public Archivo saveArchivo(Archivo archivo);

  public void deleteArchivo(Integer id_archivo);

}
