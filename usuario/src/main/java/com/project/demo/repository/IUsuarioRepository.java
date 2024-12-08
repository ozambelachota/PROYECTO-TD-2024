package com.project.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.usuarioModel;

;

@Repository
public interface IUsuarioRepository extends CrudRepository<usuarioModel, Integer>{
    
}
