package com.project.demo.infrastructure.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.domain.catalogoModel;


@Repository
public interface ICatalogoRepository extends CrudRepository<catalogoModel, Integer>{
    
}
