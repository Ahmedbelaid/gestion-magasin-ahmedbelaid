package com.test.tpgestionmagasinstock.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="Fournisseur")

public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;


    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;

    @ManyToMany
    private List<SecteurActivite> secteurActivites;

    @OneToMany(mappedBy="fournisseur")
    private List<Facture> factures ;

    @OneToOne private Fournisseur fournisseur;

    @OneToOne(mappedBy = "fournisseur")
    private DetailFournisseur detailFournisseur;
}



