package org.example;

import java.time.LocalDate;

public class Commande {
    private  int idCommande;
    private LocalDate dateCommande;
    private Client ClientCommande;

    public Commande(int idCommande, LocalDate dateCommande, Client clientCommande) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        ClientCommande = clientCommande;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClientCommande() {
        return ClientCommande;
    }

    public void setClientCommande(Client clientCommande) {
        ClientCommande = clientCommande;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", dateCommande=" + dateCommande +
                ", ClientCommande=" + ClientCommande +
                '}';
    }
}
