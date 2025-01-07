package com.project.demo.infrastructure.repositories;

<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.demo.domain.personaModel;
=======
=======
import org.springframework.data.jpa.repository.Query;
>>>>>>> 8d121d9 (feature: Modulo Usuario Corregido)
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
>>>>>>> af798b7 (feature: files reorganized)
=======
import com.project.demo.domain.personaModel;
>>>>>>> 8d121d9 (feature: Modulo Usuario Corregido)
import com.project.demo.domain.usuarioModel;

@Repository
public interface IUsuarioRepository extends CrudRepository<usuarioModel, Integer>{
<<<<<<< HEAD
<<<<<<< HEAD
    @Query("SELECT p FROM personaModel p WHERE p.id_persona = :id")
    public personaModel gerPersonabyUsuario(@Param("id") int id);
=======
    
>>>>>>> af798b7 (feature: files reorganized)
=======
    @Query("SELECT p FROM personaModel p WHERE p.id_persona = :id")
    public personaModel gerPersonabyUsuario(@Param("id") int id);
>>>>>>> 8d121d9 (feature: Modulo Usuario Corregido)
}
