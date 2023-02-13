package com.example.myproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Abonnement")
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NumAbon")
    private Long numAbon; // Clé primaire
    private Date dateDebut;
    private Date dateFin;
    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;
}
