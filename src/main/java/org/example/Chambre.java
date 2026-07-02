package org.example;

public class Chambre {
    private int numeroChambre;
    private String type;
    private double prixNuit;
    private String statut;
    private String telephoneFixe;

    public Chambre(int numeroChambre, String type, double prixNuit, String statut, String telephoneFixe) {
        this.numeroChambre = numeroChambre;
        this.type = type;
        this.prixNuit = prixNuit;
        this.statut = statut;
        this.telephoneFixe = telephoneFixe;
    }

    public int getNumeroChambre() { return numeroChambre; }
    public void setNumeroChambre(int numeroChambre) { this.numeroChambre = numeroChambre; }

    public String getTypeChambre() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPrixNuit() { return prixNuit; }
    public void setPrixNuit(double prixNuit) { this.prixNuit = prixNuit; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getTelephoneFixe() { return telephoneFixe; }
    public void setTelephoneFixe(String telephoneFixe) { this.telephoneFixe = telephoneFixe; }

    public void changerStatut(String nouveauStatut) {
        this.statut = nouveauStatut;
        System.out.println("Le statut de la chambre N°" + this.numeroChambre + " est désormais : " + this.statut);
    }
}
