package com.project.demo.adapters.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.adapters.rest.constants.catalgoEndPoints;
import com.project.demo.domain.catalogoModel;
import com.project.demo.infrastructure.servicesImpl.CatalogoService;

@RestController
@RequestMapping(catalgoEndPoints.CATALOGO_ENDPOINT)
public class catalogoController {

    @Autowired
    CatalogoService service;

    @GetMapping(catalgoEndPoints.CATALOGO_GET_ALL)
    public List<catalogoModel> getAll(){
        return service.getAll();
    }

    @GetMapping(catalgoEndPoints.CATALOGO_CREATE)
    public catalogoModel create(@RequestBody catalogoModel model){
        return service.add(model);
    }

    @GetMapping(catalgoEndPoints.CATALOGO_GET_BY_ID)
    public catalogoModel getById(@RequestAttribute int id){
        return service.getById(id);
    }

    @PutMapping(catalgoEndPoints.CATALOGO_UPDATE)
    public catalogoModel update(@RequestBody catalogoModel model){
        return service.update(model);
    }

    @DeleteMapping(catalgoEndPoints.CATALOGO_DELETE)
    public boolean delete(@RequestAttribute int id){
        return service.delete(id);
    }
}

