package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private int id;
    private Client client;
    private Employe employe;
    private Chambre chambre;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private ModePaiement modePaiement;
    private StatutReservation statut;

    public Reservation(int id, Client client, Employe employe,
                       Chambre chambre, LocalDate dateDebut,
                       LocalDate dateFin, ModePaiement modePaiement) {

        this.id = id;
        this.client = client;
        this.employe = employe;
        this.chambre = chambre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.modePaiement = modePaiement;
        this.statut = StatutReservation.EN_ATTENTE;
    }

    public long dureeSejour() {
        return ChronoUnit.DAYS.between(dateDebut, dateFin);
    }

    public void confirmer() {
        statut = StatutReservation.CONFIRMEE;
    }

    public void annuler() {
        statut = StatutReservation.ANNULEE;
    }

}