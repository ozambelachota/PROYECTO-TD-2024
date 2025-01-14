package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.application.ResolucionService;
import com.resolucion.resolucion.domain.Resolucion;
import com.resolucion.resolucion.domain.api.ApiEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiEndpoint.API_BASE_URL_RESOLUCION)
public class ResolucionController {

  @Autowired
  private ResolucionService resolucionService;
    @Autowired
    private ResourcePatternResolver resourcePatternResolver;

  @GetMapping(value = ApiEndpoint.GET_ALL_RESOLUCION)
  public ResponseEntity<?> getAllResolucion() {
    return new ResponseEntity<>(resolucionService.findResolucionAll(), HttpStatus.OK);
  }
  @PostMapping(value = ApiEndpoint.CREATE_RESOLUCION)
  public ResponseEntity<?> create(@RequestBody Resolucion resolucion) {
    return new ResponseEntity<>(
      resolucionService.saveResolucion(resolucion),
      HttpStatus.CREATED
    );
  }
  @PutMapping(value = ApiEndpoint.UPDATE_RESOLUCION)
  public ResponseEntity<?> update(@PathVariable(value = "id_resolucion") Integer id_resolucion,@RequestBody Resolucion resolucion) {
    var resolucionUpdate = new Resolucion();
    resolucionUpdate.setId_resolucion(id_resolucion);
    resolucionUpdate.setTipo(resolucion.getTipo());
    resolucionUpdate.setEstado(resolucion.getEstado());
    resolucionUpdate.setArchivo(resolucion.getArchivo());
    resolucionUpdate.setCreadoFecha(resolucion.getCreadoFecha());
    resolucionUpdate.setCreadoUsuario(resolucion.getCreadoUsuario());
    resolucionUpdate.setModificadoFecha(resolucion.getModificadoFecha());
    resolucionUpdate.setModificadoUsuario(resolucion.getModificadoUsuario());
    resolucionUpdate.setCodigo(resolucion.getCodigo());
    resolucionUpdate.setSolicitud(resolucion.getSolicitud());
    resolucionUpdate.setTitulo(resolucion.getTitulo());
    resolucionUpdate.setEliminacionFecha(resolucion.getEliminacionFecha());
    resolucionUpdate.setEliminacionUsuario(resolucion.getEliminacionUsuario());
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
    }

    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
