package org.example;

public class ServiceHotel {
    private int id;
    private String nomService;
    private double prix;

    public Service(int id, String nomService, double prix) {
        this.id = id;
        this.nomService = nomService;
        this.prix = prix;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomService() { return nomService; }
    public void setNomService(String nomService) { this.nomService = nomService; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }


    public void modifierTarif(double nouveauPrix) {
        this.prix = nouveauPrix;
        System.out.println("Le tarif du service '" + this.nomService + "' a été modifié. Nouveau prix : " + this.prix + " €");
    }

    public void afficherDetailService(Chambre chambre) {
        System.out.println("--- Détail Service pour la Chambre N°" + chambre.getNumeroChambre() + " ---");
        System.out.println("- Service consommé : " + this.nomService);
        System.out.println("- Prix unitaire : " + this.prix + " €");
        System.out.println("----------------------------------------------");
        System.out.println("Total à payer pour ce service : " + this.prix + " €");
    }

}
