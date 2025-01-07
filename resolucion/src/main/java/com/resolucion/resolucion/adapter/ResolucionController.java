package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.domain.api.ApiEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = ApiEndpoint.API_BASE_URL_RESOLUCION)
public class ResolucionController {

  @GetMapping(value = ApiEndpoint.GET_ALL_RESOLUCION)
  public ResponseEntity<?> getAllResolucion() {
    return new ResponseEntity<>("Listado de resoluciones", HttpStatus.OK);
  }
}
