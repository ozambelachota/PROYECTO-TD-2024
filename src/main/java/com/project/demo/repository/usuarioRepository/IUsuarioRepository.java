package com.project.demo.repository.usuarioRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.usuarioModel.usuarioModel;

@Repository
public interface IUsuarioRepository extends CrudRepository<usuarioModel, Integer>{
    
}
