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
    return new ResponseEntity<>(
      decanoService.saveDecano(decano),
      HttpStatus.CREATED
    );
  }
  @PutMapping(value = ApiEndpoint.UPDATE_DECANO)
  public ResponseEntity<?> update(@PathVariable(value = "id_resolucion") Integer id_resolucion,@RequestBody Decano decano) {
    return new ResponseEntity<>(
      decanoService.updateDecano(decano),
      HttpStatus.OK
    );
  }
  @DeleteMapping(value = ApiEndpoint.DELETE_DECANO)
  public ResponseEntity<?> delete(
    @PathVariable(value = "id_resolucion") Integer id_resolucion
  ) {
    if (decanoService.deleteDecano(id_resolucion)) {
      return new ResponseEntity<>(HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
