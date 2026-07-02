package org.example;

import java.time.LocalDate;

public class Facture {
    private int id;
    private String fraisResto;
    private String fraisServices;
    private String fraisSejour;
    private int total;
    private boolean estPaye;

    public Facture(int id, String fraisResto, String fraisServices, String fraisSejour, int total, boolean estPaye) {
        this.id = id;
        this.fraisResto = fraisResto;
        this.fraisServices = fraisServices;
        this.fraisSejour = fraisSejour;
        this.total = total;
        this.estPaye = estPaye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFraisResto() {
        return fraisResto;
    }

    public void setFraisResto(String fraisResto) {
        this.fraisResto = fraisResto;
    }

    public String getFraisServices() {
        return fraisServices;
    }

    public void setFraisServices(String fraisServices) {
        this.fraisServices = fraisServices;
    }

    public String getFraisSejour() {
        return fraisSejour;
    }

    public void setFraisSejour(String fraisSejour) {
        this.fraisSejour = fraisSejour;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isEstPaye() {
        return estPaye;
    }

    public void setEstPaye(boolean estPaye) {
        this.estPaye = estPaye;
    }
}
