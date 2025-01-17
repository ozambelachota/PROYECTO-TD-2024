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
    return new ResponseEntity<>(
      solicitudService.findSolicitudAll(),
      HttpStatus.OK
    );
  }

  @PostMapping(value = ApiEndpoint.CREATE_SOLICITUD)
  public ResponseEntity<?> create(@RequestBody Solicitud solicitud) {
    return new ResponseEntity<>(
      solicitudService.saveSolicitud(solicitud),
      HttpStatus.CREATED
    );
  }

  @PutMapping(value = ApiEndpoint.UPDATE_SOLICITUD)
  public ResponseEntity<?> update(@PathVariable(value = "id_resolucion") Integer id_resolucion,@RequestBody Solicitud solicitud) {
    Solicitud solicitudUpdate = new Solicitud();
    solicitudUpdate.setId_resolucion(id_resolucion);
    solicitudUpdate.setComentario(solicitud.getComentario());
    solicitudUpdate.setEstado(solicitud.getEstado());
    solicitudUpdate.setId_resolucion(solicitud.getId_resolucion());

    solicitudUpdate.setFase(solicitud.getFase());
    solicitudUpdate.setCreadoFecha(solicitud.getCreadoFecha());
    solicitudUpdate.setCreadoUsuario(solicitud.getCreadoUsuario());
    solicitudUpdate.setModificadoFecha(solicitud.getModificadoFecha());
    solicitudUpdate.setModificadoUsuario(solicitud.getModificadoUsuario());

    return new ResponseEntity<>(
      solicitudService.updateSolicitud(solicitud),
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
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
