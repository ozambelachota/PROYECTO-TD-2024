package main.java.com.project.demo.Modulo_Solicitud.controller;

import java.util.List;

import main.java.com.project.demo.Modulo_Solicitud.model.SolicitudModel;
import main.java.com.project.demo.Modulo_Solicitud.services.SolicitudService;

@RestController
@RequestMapping("")
public class SolicitudController {

    @Autowired
    SolicitudService solicitudService;

    @GetMapping("/getAll")
    public List<SolicitudModel> getAll(){
        return solicitudService.findAll();
    }
    
}
