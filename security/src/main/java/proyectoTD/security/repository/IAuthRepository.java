package proyectoTD.security.repository;

import org.springframework.stereotype.Repository;

import proyectoTD.security.model.AccesModel;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IAuthRepository extends CrudRepository<AccesModel, Integer>{
    
}
