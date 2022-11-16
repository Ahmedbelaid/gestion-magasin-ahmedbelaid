package com.test.tpgestionmagasinstock.Services;


import com.test.tpgestionmagasinstock.Entity.CategorieProduit;
import com.test.tpgestionmagasinstock.Entity.Produit;
import com.test.tpgestionmagasinstock.Repository.CategorieProduitRepository;
import com.test.tpgestionmagasinstock.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProduitServiceImp implements ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    public Produit addProduit(Produit produit) {return produitRepository.save(produit);}


    @Override
    public Produit updateProduit (long idProduit, Produit produit) {
        Produit produit1 = produitRepository.findById(idProduit).orElse(null);
        if (produit1!=null) {
            produit1.setCodeProduit(produit.getCodeProduit());
            produit1.setLibelleProduit(produit.getLibelleProduit());
            produit1.setPrix(produit.getPrix());
            produit1.setDateCreation(produit.getDateCreation());
            produit1.setDateDerniereModification(produit.getDateDerniereModification());

            return produitRepository.save(produit1);

        }
        else return null;
    }

    @Override
    public String deleteProduit(Produit produit) {
        if(produit != null) {
            produitRepository.delete(produit);
            return "produit supprimé";

        }

        return "produit non existant";
    }


    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }
    @Override
    public Produit getById(long idProduit) {
        return produitRepository.findById(idProduit).orElse(null);
    }


    public void  assignProduitToCategorieProduit(long idProduit, long idCategorieProduit ) {
        Produit produit= produitRepository.findById(idProduit).orElse(null) ;
       /* CategorieProduit categorieProduit= CategorieProduitRepository.findById(idCategorieProduit).orElse(null) ;
        if (Produit!=null && CategorieProduit!=null) {
            produit.setDept(CategorieProduit);
            produitRepository.save(produit); */
        }

    }


