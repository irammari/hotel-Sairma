package org.example;

import java.time.LocalDate;

public abstract class Paiement {

    private int id;
    private Facture facture;
    private int total;
    private double montant;
    private LocalDate datePaiement;

    public Paiement(int id, Facture facture, double montant, LocalDate datePaiement) {
        this.id = id;
        this.facture = facture;
        this.montant = montant;
        this.datePaiement = datePaiement;
    }

    public abstract void traiterPaiement() {

    };
}