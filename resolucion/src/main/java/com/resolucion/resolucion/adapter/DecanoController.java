package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.application.DecanoService;
import com.resolucion.resolucion.domain.Decano;
import com.resolucion.resolucion.domain.api.ApiEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiEndpoint.API_BASE_URL_DECANO)
public class DecanoController {
  @Autowired
  private DecanoService decanoService;

  @GetMapping(value = ApiEndpoint.GET_ALL_DECANO)
  public ResponseEntity<?> getAll() {
    return new ResponseEntity<>(
      decanoService.findDecanoAll(),
      HttpStatus.OK
    );
  }
  @PostMapping(value = ApiEndpoint.CREATE_DECANO)
  public ResponseEntity<?> create(@RequestBody Decano decano) {
    if(decano == null){throw new IllegalArgumentException("El decano no puede ser nulo");}
      return new ResponseEntity<>(
      decanoService.saveDecano(decano),
      HttpStatus.CREATED
    );
  }
  @PutMapping(value = ApiEndpoint.UPDATE_DECANO)
  public ResponseEntity<?> update(@PathVariable(value = "id_decano") Integer id_decano,@RequestBody Decano decano) {
    if(decano == null){throw new IllegalArgumentException("El decano no puede ser nulo");}
    if(id_decano == null){throw new IllegalArgumentException("El id de la resolucion no puede ser nulo");}

    Decano decanoUpdate = new Decano();
    decanoUpdate.setIdDecano(id_decano);
    decanoUpdate.setEstado(decano.getEstado());
    decanoUpdate.setResolucion(decano.getResolucion());
    decanoUpdate.setCreadoFecha(decano.getCreadoFecha());
    decanoUpdate.setCreadoUsuario(decano.getCreadoUsuario());
    decanoUpdate.setModificadoFecha(decano.getModificadoFecha());
    decanoUpdate.setModificadoUsuario(decano.getModificadoUsuario());
    decanoUpdate.setEliminacionFecha(decano.getEliminacionFecha());
    decanoUpdate.setEliminacionUsuario(decano.getEliminacionUsuario());


    return new ResponseEntity<>(
      decanoService.updateDecano(decano),
      HttpStatus.OK
    );
  }
  @DeleteMapping(value = ApiEndpoint.DELETE_DECANO)
  public ResponseEntity<?> delete(
    @PathVariable(value = "id_decano") Integer id_decano
  ) {
    if (decanoService.deleteDecano(id_decano)) {
      return new ResponseEntity<>(HttpStatus.OK);
    }
    throw new IllegalArgumentException("No se pudo eliminar el decano");
  }
}
