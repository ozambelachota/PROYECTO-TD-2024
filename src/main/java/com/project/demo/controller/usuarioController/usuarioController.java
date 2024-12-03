package com.project.demo.controller.usuarioController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.endpoints.usuarioEndpoint.usuarioEndpoint;
import com.project.demo.model.usuarioModulo.usuarioModel;
import com.project.demo.services.usuarioService.UsuarioService;

@RestController
@RequestMapping(usuarioEndpoint.USUARIO_ENDPOINT)
public class usuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping(usuarioEndpoint.USUARIO_GET_ALL)
    public List<usuarioModel> getAll(){
        return usuarioService.getAll();
    }

    @GetMapping(usuarioEndpoint.USUARIO_CREATE)
    public usuarioModel create(@RequestBody usuarioModel model){
        return usuarioService.add(model);
    }

    @GetMapping(usuarioEndpoint.USUARIO_GET_BY_ID)
    public usuarioModel getById(@RequestAttribute int id){
        return usuarioService.getById(id);
    }

    @PutMapping(usuarioEndpoint.USUARIO_UPDATE)
    public usuarioModel update(@RequestBody usuarioModel model){
        return usuarioService.update(model);
    }

    @DeleteMapping(usuarioEndpoint.USUARIO_DELETE)
    public boolean delete(@RequestAttribute int id){
        return usuarioService.delete(id);
    }
}
