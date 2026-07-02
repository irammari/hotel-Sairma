package org.example;

public class PaiementCarte extends ModePaiement {

    private String referenceCarte;

    public PaiementCarte(String referenceCarte) {
        this.referenceCarte = referenceCarte;
    }

    public String getReferenceCarte() {
        return referenceCarte;
    }

    public void setReferenceCarte(String referenceCarte) {
        this.referenceCarte = referenceCarte;
    }

    @Override
    public void traiterPaiement(Facture facture) {
        facture.setEstPaye(true);
        System.out.println("Paiement par carte effectué.");
        System.out.println("Référence : " + referenceCarte);
    }
}