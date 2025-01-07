package com.resolucion.resolucion.adapter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.resolucion.resolucion.domain.api.ApiEndpoint;


@RestController
@RequestMapping(value = ApiEndpoint.API_BASE_URL_ARCHIVO))
public class ArchivoController {
    
    @GetMapping(value = ApiEndpoint.GET_ALL_ARCHIVO)
    public ResponseEntity<?> getAll(@RequestParam String param) {
        return new ResponseEntity<?>("Listado de archivos", HttpStatus.OK);
    }
    
}
