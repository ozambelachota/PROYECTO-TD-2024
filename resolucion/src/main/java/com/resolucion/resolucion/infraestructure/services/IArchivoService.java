package com.resolucion.resolucion.infraestructure.services;

import java.util.List;

import com.resolucion.resolucion.domain.Archivo;

public  interface IArchivoService {

  List<Archivo> findArchivoAll();

  Archivo findArchivoById(Integer id_archivo);

  Archivo saveArchivo(Archivo archivo);

  boolean deleteArchivo(Integer id_archivo);

}
