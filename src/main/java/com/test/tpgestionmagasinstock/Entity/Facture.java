package com.test.tpgestionmagasinstock.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Facture {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idFacture;
    private float montantRemise;
    private float montantFacture;
    private Date dateCreationFacture;
    private Date dateDerniereModification;
    private boolean achrivee;

    @OneToMany(mappedBy="fact")
    private List<DetailFacture> detailFactures ;

    @OneToMany(mappedBy="fact")
    private List<Reglement> reglements ;
    @ManyToOne
    private  Fournisseur fournisseur ;

}
