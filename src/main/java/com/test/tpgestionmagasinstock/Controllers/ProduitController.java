package com.test.tpgestionmagasinstock.Controllers;

import com.test.tpgestionmagasinstock.Entity.Produit;
import com.test.tpgestionmagasinstock.Services.IProduitServiceImp;
import com.test.tpgestionmagasinstock.Services.ProduitService;
import com.test.tpgestionmagasinstock.generic.ControllerGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("produits")

public class ProduitController extends ControllerGeneric<Produit,Long> {
    @Autowired
    private IProduitServiceImp service;
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public String UpdateProduit(@RequestBody Produit p, @PathVariable Long id) {
        try {
            Produit updateProduit= service.retrieve(id);
            if (updateProduit==null){
                return "Produit not found with id :";
            }
            updateProduit.setCategorieProduit(p.getCategorieProduit());
            updateProduit.setCodeProduit(p.getCodeProduit());
            updateProduit.setLibelleProduit(p.getLibelleProduit());
            updateProduit.setPrix(p.getPrix());
            updateProduit.setDetailFacture(p.getDetailFacture());
            updateProduit.setStock(p.getStock());
            updateProduit.setDateCreation(p.getDateCreation());
            updateProduit.setDateDerniereModification(p.getDateDerniereModification());
            service.update(updateProduit);

        } catch (Exception err) {
            throw new RuntimeException(err);
        }
        return "Produit modifié";
    }
}
