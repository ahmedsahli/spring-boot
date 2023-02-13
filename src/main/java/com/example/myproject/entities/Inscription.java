package com.example.myproject.entities;

import javax.persistence.*;
import java.io.Serializable;
    @Entity
    @Table( name = "Inscription")
    public class Inscription implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "numInscription")
        private Long numInscription ;
        private int numSemaine;
        @ManyToOne
        Skieur skieur;
        @ManyToOne
        Cours cours;

}
