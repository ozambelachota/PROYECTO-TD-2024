package com.project.demo.infrastructure.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.domain.personaModel;

@Repository
public interface IPersonaRepository extends CrudRepository<personaModel, Integer>{
    
}
