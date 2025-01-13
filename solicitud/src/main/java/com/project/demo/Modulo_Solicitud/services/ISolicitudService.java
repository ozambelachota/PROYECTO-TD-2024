package main.java.com.project.demo.Modulo_Solicitud.services;

import java.util.List;

import main.java.com.project.demo.Modulo_Solicitud.model.SolicitudModel;

public interface ISolicitudService {

    public SolicitudModel add(SolicitudModel model);

    public SolicitudModel update(SolicitudModel model);

    public boolean delete (int id);

    public List<SolicitudModel> findAll();
    
    public  SolicitudModel findById(int id);
    
    
}
