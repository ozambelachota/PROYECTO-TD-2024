package com.project.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.personaModel;

@Repository
public interface IPersonaRepository extends CrudRepository<personaModel, Integer>{
    
}
