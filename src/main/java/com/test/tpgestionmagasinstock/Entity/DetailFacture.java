package com.test.tpgestionmagasinstock.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetailFacture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFacture;
    private int qteCommandes;
    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;

    @ManyToOne(cascade =CascadeType.PERSIST)
    @JsonIgnore
    public Facture facture;
    @ManyToOne
    @JsonIgnore
    public Produit produit;



}
