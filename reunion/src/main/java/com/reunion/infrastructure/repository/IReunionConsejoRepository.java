package com.reunion.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reunion.domain.ReunionConsejoModel;

@Repository
public interface IReunionConsejoRepository extends CrudRepository<ReunionConsejoModel, Integer>{

    
}
