package com.test.tpgestionmagasinstock.Repository;


import com.test.tpgestionmagasinstock.Entity.CategorieProduit;
import com.test.tpgestionmagasinstock.Entity.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReglementRepository extends JpaRepository<Reglement,Integer> {
}
