package com.reunion.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reunion.domain.ReunionConsejoModel;
import com.reunion.domain.endpoints.ReunionConsejoEndpoint;
import com.reunion.infrastructure.service.ReunionConsejoService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping(name = ReunionConsejoEndpoint.reunionConsejoBasic)
public class ReunionConsejoController {

    @Autowired
    ReunionConsejoService serviceConsejo;

    @GetMapping(name = ReunionConsejoEndpoint.reunionConsejoGetAll)
    public List<ReunionConsejoModel>getAll(){
        return serviceConsejo.getAll();
    }

    @PostMapping(name =  ReunionConsejoEndpoint.reunionConsejoCreate)
    public ReunionConsejoModel create(@RequestBody ReunionConsejoModel model){
        return serviceConsejo.add(model);
    }
    @GetMapping(name =  ReunionConsejoEndpoint.reunionConsejoBuscarID)
    public ReunionConsejoModel getById(@PathVariable("id_reunion") int id){
        return serviceConsejo.getById(id);
    }

    @PutMapping(name =  ReunionConsejoEndpoint.reunionConsejoUpdate)
    public ReunionConsejoModel update(@RequestBody ReunionConsejoModel model){
        return serviceConsejo.update(model);
    }

    @DeleteMapping(name =  ReunionConsejoEndpoint.reunionConsejoDelete)
    public boolean delete(@PathVariable("id_reunion") int id){
        return serviceConsejo.delete(id);
    }
    
}
