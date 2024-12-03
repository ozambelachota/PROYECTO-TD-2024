package com.project.demo.repository.usuarioRepository;

import org.springframework.data.repository.CrudRepository;

import com.project.demo.model.usuarioModulo.usuarioModel;

public interface IUsuarioRepository extends CrudRepository<usuarioModel, Integer>{
    
}
