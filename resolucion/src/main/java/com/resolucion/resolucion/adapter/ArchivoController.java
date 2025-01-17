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
    return new ResponseEntity<>(archivos, HttpStatus.OK);
  }

  @PostMapping(value = ApiEndpoint.CREATE_ARCHIVO)
  public ResponseEntity<?> create(@RequestBody Archivo archivo) {
    return new ResponseEntity<>(
      archivoService.saveArchivo(archivo),
      HttpStatus.CREATED
    );
  }
  @PutMapping(value = ApiEndpoint.UPDATE_ARCHIVO)
  public ResponseEntity<?> update(@PathVariable(value = "id_archivo") Integer id_archivo,@RequestBody Archivo archivo) {
      var archivoUpdate = new Archivo();
      archivoUpdate.setId_archivo(id_archivo);
      archivoUpdate.setLink(archivo.getLink());
      archivoUpdate.setNaturaleza(archivo.getNaturaleza());
      archivoUpdate.setEstado(archivo.getEstado());
      archivoUpdate.setCreadoUsuario(archivo.getCreadoUsuario());
      archivoUpdate.setCreadoFecha(archivo.getCreadoFecha());
      archivoUpdate.setModificadoUsuario(archivo.getModificadoUsuario());
      archivoUpdate.setModificadoFecha(archivo.getModificadoFecha());
      archivoUpdate.setEliminacionUsuario(archivo.getEliminacionUsuario());
      archivoUpdate.setEliminacionFecha(archivo.getEliminacionFecha());

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
      return new ResponseEntity<>("eliminado",HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }

}
