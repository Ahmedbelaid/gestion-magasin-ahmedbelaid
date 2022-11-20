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

public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCategorieProduit;
    public String codeProduit;
    public String libelleCategorieProduit;
    @OneToMany(mappedBy = "categorieProduit")
    public Set<Produit> produits;
}
