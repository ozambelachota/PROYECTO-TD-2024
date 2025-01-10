package com.reunionconsejo.adapters;

import org.springframework.stereotype.Controller;

import com.reunionconsejo.domain.endpoints.ReunionConsejoEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@Controller()
@RequestMapping(name = ReunionConsejoEndpoint.reunionConsejoBasic)
public class ReunionConsejoController {

    @GetMapping(name = ReunionConsejoEndpoint.reunionConsejoGetAll)
    public String getMethodName(){
        return "listando";
    }
    @PutMapping("{id_reunion}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //T
        
        return entity;
    }
    
}
