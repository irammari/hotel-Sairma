package org.example;

public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String poste;
    private double salaire;
    private String groupe;

    public Employe(int id, String nom, String prenom, String poste, double salaire, String groupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.salaire = salaire;
        this.groupe = groupe;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getPoste() { return poste; }
    public void setPoste(String poste) { this.poste = poste; }

    public double getSalaire() { return salaire; }
    public void setSalaire(double salaire) { this.salaire = salaire; }

    public String getGroupe() { return groupe; }
    public void setGroupe(String groupe) { this.groupe = groupe; }


    public void enregistrerArrivee() {
        System.out.println("Présence enregistrée pour l'employé : " + this.prenom + " " + this.nom + " (Groupe : " + this.groupe + ")");
    }

    public void modifierPoste(String nouveauPoste) {
        String ancienPoste = this.poste;
        this.poste = nouveauPoste;
        System.out.println("Le rôle de " + this.prenom + " " + this.nom + " a été modifié : " + ancienPoste + " -> " + nouveauPoste);
    }
}
