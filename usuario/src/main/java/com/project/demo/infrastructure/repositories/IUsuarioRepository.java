package com.project.demo.infrastructure.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.domain.usuarioModel;

@Repository
public interface IUsuarioRepository extends CrudRepository<usuarioModel, Integer>{
    
}
