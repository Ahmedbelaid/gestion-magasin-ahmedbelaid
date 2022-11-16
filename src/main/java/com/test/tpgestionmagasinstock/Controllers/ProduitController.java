package com.test.tpgestionmagasinstock.Controllers;

import com.test.tpgestionmagasinstock.Entity.Produit;
import com.test.tpgestionmagasinstock.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("produits")

public class ProduitController {

    @Autowired
    ProduitService produitService;


    @Autowired
    @GetMapping
    public List<Produit> displayProduits() { return produitService.getAllProduit();}

    @PostMapping
    public Produit addProduit (@RequestBody Produit produit) {
        return produitService.addProduit(produit);
    }

    @PutMapping("{id}")
    public Produit updateProduit (@PathVariable("idProduit") long idProduit, @RequestBody Produit produit) {
        return produitService.updateProduit( idProduit, produit);
    }

    @DeleteMapping("{id}")
    public String deleteProduit(@PathVariable("id") long idProduit) {
        return produitService.deleteProduit(produitService.getById(idProduit));

    }
    @GetMapping("{id}")
    public Produit getById(@PathVariable("id")long idProduit){
        return produitService.getById(idProduit);

    }
}
