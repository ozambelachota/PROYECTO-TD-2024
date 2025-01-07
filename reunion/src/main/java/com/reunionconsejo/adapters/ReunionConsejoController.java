package com.reunionconsejo.adapters;

import org.springframework.stereotype.Controller;

import com.reunionconsejo.domain.endpoints.ReunionConsejoEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller()
@RequestMapping(name = ReunionConsejoEndpoint.reunionConsejoBasic)
public class ReunionConsejoController {

    @GetMapping(name = ReunionConsejoEndpoint.reunionConsejoGetAll)
    public String getMethodName(){
        return "listando";
    }
    
}
