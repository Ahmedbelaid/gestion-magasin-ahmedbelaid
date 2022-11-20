package com.test.tpgestionmagasinstock.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class SecteurActivite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idSecteurActivite;
    public String codeSecteurActivite;
    public String libelleSecteurActivite;
    @ManyToMany
    public Set<Fournisseur> fournisseurs;

}
