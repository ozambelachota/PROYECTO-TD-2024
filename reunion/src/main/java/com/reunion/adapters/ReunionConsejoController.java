package com.reunion.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reunion.domain.ReunionConsejoModel;
import com.reunion.domain.endpoints.APIEndPoint;
import com.reunion.infrastructure.service.ReunionConsejoService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping(value = APIEndPoint.reunionConsejoBasic)
public class ReunionConsejoController {

    @Autowired
    ReunionConsejoService serviceConsejo;

    @GetMapping(value = APIEndPoint.reunionConsejoGetAll)
    public List<ReunionConsejoModel>getAll(){
        return serviceConsejo.getAll();
    }

    @PostMapping(value =  APIEndPoint.reunionConsejoCreate)
    public ReunionConsejoModel create(@RequestBody ReunionConsejoModel model){
        return serviceConsejo.add(model);
    }
    @GetMapping(value =  APIEndPoint.reunionConsejoBuscarID)
    public ReunionConsejoModel getById(@PathVariable("id_reunion") int id){
        return serviceConsejo.getById(id);
    }

    @PutMapping(value = APIEndPoint.reunionConsejoUpdate)
    public ReunionConsejoModel update(@RequestBody ReunionConsejoModel model){
        return serviceConsejo.update(model);
    }

    @DeleteMapping(value =  APIEndPoint.reunionConsejoDelete)
    public boolean delete(@PathVariable("id_reunion") int id){
        return serviceConsejo.delete(id);
    }
    
}
