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

public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private int qte;
    private int qteMin;
    private String libelleStock;
    @OneToMany(mappedBy = "stock")
    private Set<Produit> produits;
}
