package com.solicitud.solicitud.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.solicitud.solicitud.application.SolicitudService;
import com.solicitud.solicitud.domain.Solicitud;
import com.solicitud.solicitud.domain.api.Endpoint;

import java.util.Optional;

@RestController
@RequestMapping(value = Endpoint.BASE_URL_SOLICITUD)
public class SolicitudController {

    @Autowired
    private SolicitudService solicitudService;

    // Obtener todas las solicitudes
    @GetMapping(value = Endpoint.GET_SOLICITUDES)
    public ResponseEntity<?> getSolicitudes() {
        return new ResponseEntity<>(solicitudService.getAllSolicitudes(), HttpStatus.OK);
    }

    // Crear una nueva solicitud
   /*  @PostMapping(value = Endpoint.CREATE_SOLICITUD)
    public ResponseEntity<?> createSolicitud(@RequestBody Solicitud solicitud) {
        return new ResponseEntity<>(solicitudService.addSolicitud(solicitud), HttpStatus.CREATED);
    }

    // Obtener una solicitud por ID
    @GetMapping(value = Endpoint.GET_SOLICITUD_BY_ID)
    public ResponseEntity<?> getSolicitudById(@PathVariable("id") String id) {
        Optional<Solicitud> solicitud = solicitudService.getByIdSolicitud(id);
        return solicitud.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>("Solicitud no encontrada", HttpStatus.NOT_FOUND));
    }

    // Actualizar una solicitud
    @PutMapping(value = Endpoint.UPDATE_SOLICITUD)
    public ResponseEntity<?> updateSolicitud(@RequestBody Solicitud solicitud) {
        return new ResponseEntity<>(solicitudService.updateSolicitud(solicitud), HttpStatus.OK);
    }

    // Eliminar una solicitud por ID
    @DeleteMapping(value = Endpoint.DELETE_SOLICITUD)
    public ResponseEntity<?> deleteSolicitud(@PathVariable("id") String id) {
        boolean isDeleted = solicitudService.deleteSolicitud(id);
        if (isDeleted) {
            return new ResponseEntity<>("Solicitud eliminada exitosamente", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Solicitud no encontrada", HttpStatus.NOT_FOUND);
        }
    }*/
}
