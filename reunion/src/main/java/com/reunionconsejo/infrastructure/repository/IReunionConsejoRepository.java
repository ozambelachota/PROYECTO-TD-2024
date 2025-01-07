package com.reunionconsejo.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reunionconsejo.domain.ReunionConsejoModel;

@Repository
public interface IReunionConsejoRepository extends CrudRepository<ReunionConsejoModel, Integer>{

    
}
