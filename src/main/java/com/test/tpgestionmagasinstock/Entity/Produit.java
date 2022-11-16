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


public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    private Date dateCreation;
    private Date dateDerniereModification;

    @ManyToOne
    private  Stock stock ;

    @OneToMany (mappedBy = "produit")
    private List<DetailFacture> detailFactures ;
    @ManyToOne
    private CategorieProduit categorieProduit;
}
