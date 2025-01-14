package com.resolucion.resolucion.adapter;

import com.resolucion.resolucion.application.SolicitudService;
import com.resolucion.resolucion.domain.Solicitud;
import com.resolucion.resolucion.domain.api.ApiEndpoint;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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


    return new ResponseEntity<>(
      solicitudService.updateSolicitud(solicitud),
      HttpStatus.OK
    );
  }
  @DeleteMapping(value = ApiEndpoint.DELETE_SOLICITUD)
  public ResponseEntity<?> delete(
    @PathVariable(value = "id_resolucion") Integer id_resolucion
  ) {
    solicitudService.deleteSolicitud(id_resolucion);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
