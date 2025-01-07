package com.resolucion.resolucion.application;

import com.resolucion.resolucion.domain.Archivo;
import com.resolucion.resolucion.infraestructure.repository.IArchivoRepository;
import com.resolucion.resolucion.infraestructure.services.IArchivoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivoService implements IArchivoService {

  @Autowired
  private IArchivoRepository archivoRepoository;

  @Override
  public List<Archivo> findArchivoAll() {
    return (List<Archivo>) archivoRepoository.findAll();
  }

  @Override
  public Archivo findArchivoById(Integer id_archivo) {
    var archivo = archivoRepoository.findById(id_archivo);
    return archivo.isPresent() ? archivo.get() : null;
  }

  @Override
  public Archivo saveArchivo(Archivo archivo) {
    return archivoRepoository.save(archivo);
  }

  @Override
  public void deleteArchivo(Integer id_archivo) {
    archivoRepoository.deleteById(id_archivo);
  }
}
