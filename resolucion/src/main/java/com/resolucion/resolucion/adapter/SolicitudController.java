package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.application.SolicitudService;
import com.resolucion.resolucion.domain.Solicitud;
import com.resolucion.resolucion.domain.api.ApiEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiEndpoint.API_BASE_URL_SOLICITUD)
public class SolicitudController {

  @Autowired
  private SolicitudService solicitudService;

  @GetMapping(value = ApiEndpoint.GET_ALL_SOLICITUD)
  public ResponseEntity<?> getAll() {
    if (solicitudService.findSolicitudAll().isEmpty()) {
      throw new IllegalArgumentException("No existen solicitudes");
    }
    return new ResponseEntity<>(
      solicitudService.findSolicitudAll(),
      HttpStatus.OK
    );
  }

  @PostMapping(value = ApiEndpoint.CREATE_SOLICITUD)
  public ResponseEntity<?> create(@RequestBody Solicitud solicitud) {
    if(solicitud == null){throw new IllegalArgumentException("La solicitud no puede ser nula");}
    return new ResponseEntity<>(
      solicitudService.saveSolicitud(solicitud),
      HttpStatus.CREATED
    );
  }

  @PutMapping(value = ApiEndpoint.UPDATE_SOLICITUD)
  public ResponseEntity<?> update(@PathVariable(value = "id_solicitud") Integer id_solicitud,@RequestBody Solicitud solicitud) {
    Solicitud solicitudUpdate = new Solicitud(
            id_solicitud,
            solicitud.getFecha(),
            solicitud.getComentario(),
            solicitud.getEstado(),
            solicitud.getFase(),
            solicitud.getTipo(),
            solicitud.getCreadoUsuario(),
            solicitud.getCreadoFecha(),
            solicitud.getModificadoUsuario(),
            solicitud.getModificadoFecha(),
            solicitud.getEliminacionUsuario(),
            solicitud.getEliminacionFecha()
    );

    if(id_solicitud == null){throw new IllegalArgumentException("El id de la solicitud no puede ser nulo");}
    if(solicitud.getComentario() == null){throw new IllegalArgumentException("El comentario no puede ser nulo");}
    if(solicitud.getEstado() == null){throw new IllegalArgumentException("El estado no puede ser nulo");}

    return new ResponseEntity<>(
      solicitudService.updateSolicitud(solicitudUpdate),
      HttpStatus.OK
    );
  }
  @DeleteMapping(value = ApiEndpoint.DELETE_SOLICITUD)
  public ResponseEntity<?> delete(
    @PathVariable(value = "id_solicitud") Integer idSolicitud
  ) {
    if (solicitudService.deleteSolicitud(idSolicitud)) {
      return new ResponseEntity<>(HttpStatus.OK);
    }
    throw new IllegalArgumentException("No se pudo eliminar la solicitud");
  }
}
