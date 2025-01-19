package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.application.DecanoService;
import com.resolucion.resolucion.domain.Decano;
import com.resolucion.resolucion.domain.api.ApiEndpoint;

import com.resolucion.resolucion.domain.dto.decano.DecanoDto;
import com.resolucion.resolucion.domain.dto.decano.DecanoSaveDTO;
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
  public ResponseEntity<?> create(@RequestBody Decano decano)  {
    Decano decanoSave = decanoService.saveDecano(decano);
    if (decanoSave == null) {
      throw new IllegalArgumentException("No se pudo crear el decano");
    }
    return new ResponseEntity<>(decanoSave, HttpStatus.CREATED);
  }
  @PutMapping(value = ApiEndpoint.UPDATE_DECANO)
  public ResponseEntity<?> update(@PathVariable(value = "id_decano") Integer id_decano,@RequestBody Decano decano) {
    if(decano == null){throw new IllegalArgumentException("El decano no puede ser nulo");}
    if(id_decano == null){throw new IllegalArgumentException("El id de la resolucion no puede ser nulo");}
    Decano decanoUpdate = new Decano(
            id_decano,
            decano.getEstado(),
            decano.getResolucion(),
            decano.getCreadoUsuario(),
            decano.getCreadoFecha(),
            decano.getModificadoUsuario(),
            decano.getModificadoFecha(),
            decano.getEliminacionUsuario(),
            decano.getEliminacionFecha()
    );

    return new ResponseEntity<>(
      decanoService.updateDecano(decanoUpdate),
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
