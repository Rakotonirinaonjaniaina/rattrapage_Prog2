package org.appartement.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String identifiant, String nom) {
        super(identifiant, nom);
        this.immeubles = new ArrayList<>();
    }

    @Override
    public int compterAppartements() {
        int total = 0;
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }

    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    public boolean contientAppartement(Appartement appartement) {
        for (Immeuble immeuble : immeubles) {
            if (immeuble.getAppartements().contains(appartement)) {
                return true;
            }
        }
        return false;
    }
}
