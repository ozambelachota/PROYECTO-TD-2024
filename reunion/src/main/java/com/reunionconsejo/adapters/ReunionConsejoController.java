package com.reunionconsejo.adapters;

import org.springframework.stereotype.Controller;

import com.reunionconsejo.domain.endpoints.ReunionConsejoEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller()
@RequestMapping(name = ReunionConsejoEndpoint.reunionConsejoBasic)
public class ReunionConsejoController {
    @GetMapping(name = ReunionConsejoEndpoint.reunionConsejoGetAll)
    public String getMethodName(@RequestParam String param) {
        return "listando";
    }
    
}
