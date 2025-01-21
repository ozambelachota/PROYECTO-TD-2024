package com.solicitud.solicitud.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solicitud.solicitud.domain.Solicitud;
import com.solicitud.solicitud.infraestructure.Repository.SolicitudRepository;
import com.solicitud.solicitud.infraestructure.Services.ISolicitudService;

@Service
public class SolicitudService implements ISolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public List<Solicitud> getAllSolicitudes() {
        return solicitudRepository.findAll();
    }

    @Override
    public Solicitud getByIdSolicitud(String id) {
        Optional<Solicitud> solicitud = solicitudRepository.findById(id);
        return solicitud.orElse(null); // Devuelve la solicitud si existe, o null si no
    }

    @Override
    public Solicitud saveSolicitud(Solicitud newSolicitud) {
        return solicitudRepository.save(newSolicitud);
    }

    public Solicitud updateSolicitud(Solicitud solicitud) {
        if (solicitudRepository.existsById(solicitud.getId_solicitud())) {
            return solicitudRepository.save(solicitud); // Actualiza la solicitud
        } else {
            throw new RuntimeException("La solicitud con ID " + solicitud.getId_solicitud() + " no existe.");
        }
    }

    public boolean deleteSolicitud(String id) {
        if (solicitudRepository.existsById(id)) {
            solicitudRepository.deleteById(id); // Elimina la solicitud si existe
            return true;
        }
        return false; // Retorna false si no existe
    }

    @Override
    public Solicitud createSolicitud(Solicitud solicitud) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createSolicitud'");
    }

    @Override
    public Solicitud addSolicitud(Solicitud solicitud) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSolicitud'");
    }
}
