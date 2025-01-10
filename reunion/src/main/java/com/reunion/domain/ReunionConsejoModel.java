package com.reunion.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "reunion_consejo")
public class ReunionConsejoModel {
    @Id
<<<<<<< HEAD
<<<<<<< Updated upstream:reunion/src/main/java/com/reunionconsejo/domain/ReunionConsejoModel.java
=======
>>>>>>> 8737a2c (Avance de REunion Miembro Controller,Model Repository)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_reunion")
    private Long id_reunion;

    @Column(name = "fecha")
    private Date fecha;
<<<<<<< HEAD
=======
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_reunion")
    private Long id_reunion;
    @Column(name = "fecha")
    private Date fecha;

>>>>>>> Stashed changes:reunion/src/main/java/com/reunion/domain/ReunionConsejoModel.java


    public Long getId_reunion() {
        return id_reunion;
    }

    public void setId_reunion(Long id_reunion) {
        this.id_reunion = id_reunion;
    }

<<<<<<< HEAD:reunion/src/main/java/com/reunion/domain/ReunionConsejoModel.java
=======
<<<<<<< Updated upstream:reunion/src/main/java/com/reunionconsejo/domain/ReunionConsejoModel.java
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

=======
>>>>>>> Stashed changes:reunion/src/main/java/com/reunion/domain/ReunionConsejoModel.java
>>>>>>> 77792ef (actualizacion):reunion/src/main/java/com/reunionconsejo/domain/ReunionConsejoModel.java
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
=======

>>>>>>> 8737a2c (Avance de REunion Miembro Controller,Model Repository)
}
