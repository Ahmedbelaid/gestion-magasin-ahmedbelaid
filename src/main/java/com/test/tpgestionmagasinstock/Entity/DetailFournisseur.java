package com.test.tpgestionmagasinstock.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    public Date dateDebutCollaboration;
    public String adresse;
    public String matricule;
    @OneToOne
    public Fournisseur fournisseur;


}
