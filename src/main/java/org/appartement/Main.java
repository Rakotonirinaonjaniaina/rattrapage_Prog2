package org.appartement;


import org.appartement.model.Appartement;
import org.appartement.model.Immeuble;
import org.appartement.model.Quartier;
import org.appartement.model.Statut;

public class Main {
    public static void main(String[] args) {
        Quartier quartier = new Quartier("Q1", "Ivandry");
        Immeuble immeubleJade = new Immeuble("I1", "Immeuble Jade", 5);
        Immeuble immeubleJhamall = new Immeuble("I2", "Immeuble Saphir", 3);

        quartier.ajouterImmeuble(immeubleJade);
        quartier.ajouterImmeuble(immeubleJhamall);

        Appartement appartement1 = new Appartement("A1", "Appartement 1", "Appartement au 3e étage", 500, Statut.LIBRE, immeubleJade);
        Appartement appartement2 = new Appartement("A2", "Appartement 2", "Appartement au 4e étage", 600, Statut.OCCUPE, immeubleJhamall);

        immeubleJade.ajouterAppartement(appartement1);
        immeubleJhamall.ajouterAppartement(appartement2);

        System.out.println("Le quartier contient l'appartement 1 ? " + quartier.contientAppartement(appartement1));
        System.out.println("Nombre total d'appartements dans le quartier : " + quartier.compterAppartements());
    }
}
