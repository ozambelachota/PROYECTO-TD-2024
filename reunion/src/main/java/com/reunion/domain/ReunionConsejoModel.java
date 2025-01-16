package com.reunionconsejo.domain;

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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reunion")
    private Long id_reunion;

    @Column(name = "fecha")
    private Date fecha;

    public Long getId_reunion() {
        return id_reunion;
    }

    public void setId_reunion(Long id_reunion) {
        this.id_reunion = id_reunion;
    }

<<<<<<< Updated upstream:reunion/src/main/java/com/reunionconsejo/domain/ReunionConsejoModel.java
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

=======
>>>>>>> Stashed changes:reunion/src/main/java/com/reunion/domain/ReunionConsejoModel.java
    public Date getFecha() {
        return fecha;
    }

}
