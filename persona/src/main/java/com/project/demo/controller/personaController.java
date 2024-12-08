package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.endpoints.personaEndPoints;
import com.project.demo.model.personaModel;
import com.project.demo.services.PersonaService;

@RestController
@RequestMapping(personaEndPoints.PERSONA_ENDPOINT)
public class personaController {

    @Autowired
    PersonaService service;

    @GetMapping(personaEndPoints.PERSONA_GET_ALL)
    public List<personaModel> getAll(){
        return service.getAll();
    }

    @GetMapping(personaEndPoints.PERSONA_CREATE)
    public personaModel create(@RequestBody personaModel model){
        return service.add(model);
    }

    @GetMapping(personaEndPoints.PERSONA_GET_BY_ID)
    public personaModel getById(@RequestAttribute int id){
        return service.getById(id);
    }

    @PutMapping(personaEndPoints.PERSONA_UPDATE)
    public personaModel update(@RequestBody personaModel model){
        return service.update(model);
    }

    @DeleteMapping(personaEndPoints.PERSONA_DELETE)
    public boolean delete(@RequestAttribute int id){
        return service.delete(id);
    }
}
