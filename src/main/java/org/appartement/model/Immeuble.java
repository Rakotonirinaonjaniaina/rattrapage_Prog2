package org.appartement.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Immeuble extends Endroit {
    private int nombreEtages;
    private List<Appartement> appartements;

    public Immeuble(String identifiant, String nom, int nombreEtages) {
        super(identifiant, nom);
        this.nombreEtages = nombreEtages;
        this.appartements = new ArrayList<>();
    }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }

    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }
}
