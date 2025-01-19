package com.reunion.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reunion.domain.PersonaModel;
import com.reunion.domain.endpoints.APIEndPoint;
import com.reunion.infrastructure.service.PersonaService;

@RestController
@RequestMapping(value= APIEndPoint.personaBasic)
public class PersonaController {

    @Autowired
    PersonaService servicePersona;

    @GetMapping(value = APIEndPoint.personaGetAll)
    public List<PersonaModel>getAll(){
        return servicePersona.getAll();
    }

    @PostMapping(value = APIEndPoint.personaCreate)
    public PersonaModel create(@RequestBody PersonaModel model){
        return servicePersona.add(model);
    }
    @GetMapping(value = APIEndPoint.personaBuscarID)
    public PersonaModel getById(@PathVariable("id_persona") int id){
        return servicePersona.getById(id);
    }

    @PutMapping(value = APIEndPoint.personaUpdate)
    public PersonaModel update(@RequestBody PersonaModel model){
        return servicePersona.update(model);
    }

    @DeleteMapping(value = APIEndPoint.personaDelete)
    public boolean delete(@PathVariable("id_persona") int id){
        return servicePersona.delete(id);
    }
    

}
