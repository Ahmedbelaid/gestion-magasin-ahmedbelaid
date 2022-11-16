package com.test.tpgestionmagasinstock.Services;

import com.test.tpgestionmagasinstock.Entity.Produit;

import java.util.List;

public interface ProduitService {

    public Produit addProduit(Produit produit);

    Produit updateProduit(long idProduit, Produit produit);

    public  String deleteProduit (Produit produit);

    public List<Produit> getAllProduit ();

    public Produit getById (long idProduit );

}
