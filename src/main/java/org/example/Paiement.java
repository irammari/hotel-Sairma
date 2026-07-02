package org.example;

import java.time.LocalDate;

public abstract class Paiement {

    private int id;
    private Facture facture;
    private double total;
    private LocalDate datePaiement;
    private ModePaiement modePaiement;

    public Paiement(int id, Facture facture, double total, LocalDate datePaiement,  ModePaiement modePaiement) {
        this.id = id;
        this.facture = facture;
        this.total = total;
        this.datePaiement = datePaiement;
        this.modePaiement = modePaiement;
    }

    public void traiterPaiement() {
        facture.setEstPaye(true);
    }
}