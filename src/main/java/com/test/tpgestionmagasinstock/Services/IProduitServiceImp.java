package com.test.tpgestionmagasinstock.Services;

import com.test.tpgestionmagasinstock.Entity.Produit;
import com.test.tpgestionmagasinstock.generic.GenericRepo;
import com.test.tpgestionmagasinstock.generic.ImplementationGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IProduitServiceImp extends ImplementationGeneric<Produit,Long> implements ProduitService {

    GenericRepo<Produit,Long> repo;

}