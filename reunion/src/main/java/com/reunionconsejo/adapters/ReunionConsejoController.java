package com.reunionconsejo.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.reunionconsejo.domain.ReunionConsejoModel;
import com.reunionconsejo.domain.endpoints.ReunionConsejoEndpoint;
import com.reunionconsejo.infrastructure.service.ReunionConsejoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@Controller()
@RequestMapping(name = ReunionConsejoEndpoint.reunionConsejoBasic)
public class ReunionConsejoController {

    @Autowired
    ReunionConsejoService serviceConsejo;

    @GetMapping(name = ReunionConsejoEndpoint.reunionConsejoGetAll)
    
    public List<ReunionConsejoModel>getAll(){
        return serviceConsejo.getAll();
    }

    @GetMapping(name =  ReunionConsejoEndpoint.reunionConsejoCreate)
    public ReunionConsejoModel create(@RequestBody ReunionConsejoModel model){
        return serviceConsejo.add(model);
    }

    
}
