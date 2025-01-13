package main.java.com.project.demo.Modulo_Solicitud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.java.com.project.demo.Modulo_Solicitud.model.SolicitudModel;

@Repository

public interface ISolicitudRepository

    extends CrudRepository<SolicitudModel, Integer>{

    }
