package com.example.myproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    @ManyToMany(mappedBy="skieurs", cascade = CascadeType.ALL)
    private Set<Piste> pistes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="skieur")
    private Set<Inscription> inscriptions;
    @OneToOne
    private Abonnement abonnement;
}
