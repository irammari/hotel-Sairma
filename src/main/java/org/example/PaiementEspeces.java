package org.example;

public class PaiementEspeces extends ModePaiement {

    private double sommeRecue;

    public PaiementEspeces(double sommeRecue) {
        this.sommeRecue = sommeRecue;
    }

    public double getSommeRecue() {
        return sommeRecue;
    }

    public void setSommeRecue(double sommeRecue) {
        this.sommeRecue = sommeRecue;
    }

    @Override
    public void traiterPaiement(Facture facture) {

        if (sommeRecue < facture.getTotal()) {
            System.out.println("Montant insuffisant.");
            return;
        }

        facture.setEstPaye(true);

        System.out.println("Paiement en espèces effectué.");
        System.out.println("Monnaie rendue : " + (sommeRecue - facture.getTotal()));
    }
}