package org.appartement.model;

import lombok.Data;

@Data
public abstract class Endroit {
    private String identifiant;
    private String nom;

    public Endroit(String identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    public abstract int compterAppartements();
}