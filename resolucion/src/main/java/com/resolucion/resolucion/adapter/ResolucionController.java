package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.application.ResolucionService;
import com.resolucion.resolucion.domain.Resolucion;
import com.resolucion.resolucion.domain.api.ApiEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiEndpoint.API_BASE_URL_RESOLUCION)
public class ResolucionController {

  @Autowired
  private ResolucionService resolucionService;

  @GetMapping(value = ApiEndpoint.GET_ALL_RESOLUCION)
  public ResponseEntity<?> getAllResolucion() {
    if (resolucionService.findResolucionAll().isEmpty()) {
      throw new IllegalArgumentException("No existen resoluciones");
    }
    return new ResponseEntity<>(resolucionService.findResolucionAll(), HttpStatus.OK);
  }
  @PostMapping(value = ApiEndpoint.CREATE_RESOLUCION)
  public ResponseEntity<?> create(@RequestBody Resolucion resolucion) {
    if(resolucion.equals(null)){
      throw new IllegalArgumentException("La resolucion no puede ser nula");
    }
    if (resolucion.getArchivo() == null) {
      throw new IllegalArgumentException("El archivo no puede ser nulo");
    }
    return new ResponseEntity<>(
      resolucionService.saveResolucion(resolucion),
      HttpStatus.CREATED
    );
  }
  @PutMapping(value = ApiEndpoint.UPDATE_RESOLUCION)
  public ResponseEntity<?> update(@PathVariable(value = "id_resolucion") Integer id_resolucion,@RequestBody Resolucion resolucion) {
    var resolucionUpdate = new Resolucion(
        id_resolucion,
        resolucion.getCodigo(),
        resolucion.getTitulo(),
        resolucion.getTipo(),
        resolucion.getEstado(),
        resolucion.getArchivo(),
        resolucion.getSolicitud(),
        resolucion.getCreadoUsuario(),
        resolucion.getCreadoFecha(),
        resolucion.getModificadoUsuario(),
        resolucion.getModificadoFecha(),
        resolucion.getEliminacionUsuario(),
        resolucion.getEliminacionFecha()
    );
    if (resolucion.getArchivo() == null) {
      throw new IllegalArgumentException("El archivo no puede ser nulo");
    }
    if(resolucion.equals(null)){
      throw new IllegalArgumentException("La resolucion no puede ser nula");
    }
    if(id_resolucion == null){
      throw new IllegalArgumentException("El id de la resolucion no puede ser nulo");
    }
    return new ResponseEntity<>(
      resolucionService.saveResolucion(resolucionUpdate),
      HttpStatus.OK
    );
  }
  @DeleteMapping(value = ApiEndpoint.DELETE_RESOLUCION)
  public ResponseEntity<?> delete(
    @PathVariable(value = "id_resolucion") Integer id_resolucion
  ) {
    if (resolucionService.deleteResolucion(id_resolucion)) {
      return new ResponseEntity<>(HttpStatus.OK);
    }else{
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
