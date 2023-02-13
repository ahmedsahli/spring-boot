package com.example.myproject.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NumMoniteur")
    private Long numMoniteur; // Clé primaire
    private String nomM;
    private Date dateDebut;
    private Date dateRecu;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;

}
