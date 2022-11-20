package com.test.tpgestionmagasinstock.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="Fournisseur")

public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idFournisseur;
    public String codeFournisseur;
    public String libelleFournisseur;
    @Enumerated(EnumType.ORDINAL)
    public CategorieFournisseur categorieFournisseur;
    @OneToMany(mappedBy = "fournisseur")
    public Set<Facture> facture;
    @ManyToMany(mappedBy = "fournisseurs")
    public Set<SecteurActivite> secteurActivite;
    @OneToOne(mappedBy = "fournisseur")
    public DetailFournisseur detailFournisseur;
}



