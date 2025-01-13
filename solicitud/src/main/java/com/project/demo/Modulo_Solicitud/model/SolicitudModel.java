package main.java.com.project.demo.Modulo_Solicitud.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitud")
public class SolicitudModel {

    @Id

    @Column(name = "id_solicitud")
    public Integer Idsolicitud;

    @Column(name = "fecha")
    public Date fecha;

    @Column(name = "comentario")
    public String comentario;

    @Column(name= "estado")
    public String  estado;

    @Column(name= "tipo")
    public String  tipo;    



    
}
