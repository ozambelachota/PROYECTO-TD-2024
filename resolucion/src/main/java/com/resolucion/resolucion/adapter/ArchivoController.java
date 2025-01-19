package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.application.ArchivoService;
import com.resolucion.resolucion.domain.Archivo;
import com.resolucion.resolucion.domain.api.ApiEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiEndpoint.API_BASE_URL_ARCHIVO)
public class ArchivoController {

  @Autowired
  private ArchivoService archivoService;

  @GetMapping(value = ApiEndpoint.GET_ALL_ARCHIVO)
  public ResponseEntity<?> getAll() {
    var archivos = archivoService.findArchivoAll();
    if (archivos.isEmpty()) {
      throw new IllegalArgumentException("No existen archivos");
    }

    return new ResponseEntity<>(archivos, HttpStatus.OK);
  }

  @PostMapping(value = ApiEndpoint.CREATE_ARCHIVO)
  public ResponseEntity<?> create(@RequestBody Archivo archivo) {
      if (archivo == null) {
        throw new IllegalArgumentException("El archivo no puede ser nulo");
      }

    return new ResponseEntity<>(
      archivoService.saveArchivo(archivo),
      HttpStatus.CREATED
    );
  }
  @PutMapping(value = ApiEndpoint.UPDATE_ARCHIVO)
  public ResponseEntity<?> update(@PathVariable(value = "id_archivo") Integer id_archivo,@RequestBody Archivo archivo) {
      Archivo archivoUpdate = new Archivo(
        id_archivo,
        archivo.getLink(),
        archivo.getNaturaleza(),
        archivo.getEstado(),
        archivo.getCreadoUsuario(),
        archivo.getCreadoFecha(),
        archivo.getModificadoUsuario(),
        archivo.getModificadoFecha(),
        archivo.getEliminacionUsuario(),
        archivo.getEliminacionFecha()
      );
      if (archivoUpdate == null) {
          throw new IllegalArgumentException("El archivo no puede ser nulo");
        }

      return new ResponseEntity<>(
      archivoService.saveArchivo(archivoUpdate),
      HttpStatus.OK
    );
  }

  @DeleteMapping(value = ApiEndpoint.DELETE_ARCHIVO)
  public ResponseEntity<?> delete(
    @PathVariable(value = "id_archivo") Integer id_archivo
  ) {
    if (archivoService.deleteArchivo(id_archivo)) {
      throw new IllegalArgumentException("No se pudo eliminar el archivo");
    }
    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }

}
