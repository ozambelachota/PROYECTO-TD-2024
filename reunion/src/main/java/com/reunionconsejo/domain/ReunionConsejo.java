package com.reunionconsejo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name="reunion_consejo")
public class ReunionConsejo {
    @Id
    @Genera()
    private Long id_reunion;
}
