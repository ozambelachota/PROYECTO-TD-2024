package com.reunion.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()

@Table(name= "reunion_miembro")
public class ReunionMiembroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_reunion_miembro")
    private Long id_reunion_miembro;

    @Column(name = "id_persona")
    private Long id_persona;

    @Column(name = "id_reunion")
    private Long id_reunion;

}
