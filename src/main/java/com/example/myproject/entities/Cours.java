package com.example.myproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table( name = "Cours")
@Getter
@Setter
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Numcours")
    private Long numCours; // Clé primaire
    private int niveau;
    private float prix;
    private int creneau;
    @Enumerated(EnumType.STRING)
    private Support support;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="cours")
    private Set<Inscription> inscriptions;

}
