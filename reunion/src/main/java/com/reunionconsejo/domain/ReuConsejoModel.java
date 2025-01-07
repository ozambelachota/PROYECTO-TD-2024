package com.reunionconsejo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name="reunion_consejo")
public class ReuConsejoModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_reunion;
    private Date fecha;
    private String Tipo;

}
