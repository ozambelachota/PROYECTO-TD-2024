package com.project.demo.infrastructure.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.demo.domain.personaModel;
import com.project.demo.domain.usuarioModel;

@Repository
public interface IUsuarioRepository extends CrudRepository<usuarioModel, Integer>{
    @Query("SELECT p FROM personaModel p WHERE p.id_persona = :id")
    public personaModel gerPersonabyUsuario(@Param("id") int id);
}
