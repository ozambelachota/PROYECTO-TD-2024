package com.reunion.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reunion.domain.PersonaModel;

@Repository
public interface IPersonaRepository extends CrudRepository<PersonaModel, Integer>{
    
}
