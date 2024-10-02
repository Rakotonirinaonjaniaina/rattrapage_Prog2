package org.appartement.model;

import lombok.Data;

@Data
public class Appartement {
    private String identifiant;
    private String titre;
    private String description;
    private double loyerMensuel;
    private Statut statut;
    private Endroit endroit;

    public Appartement(String identifiant, String titre, String description, double loyerMensuel, Statut statut, Endroit endroit) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.endroit = endroit;
    }
}
