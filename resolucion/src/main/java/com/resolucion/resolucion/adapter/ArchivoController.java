package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.application.ArchivoService;
import com.resolucion.resolucion.domain.api.ApiEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
