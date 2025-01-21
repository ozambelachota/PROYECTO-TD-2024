package com.solicitud.solicitud.infraestructure.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.solicitud.solicitud.domain.Solicitud;

@Repository
public interface SolicitudRepository extends MongoRepository<Solicitud, String> {
    // Puedes agregar métodos personalizados si es necesario
}
