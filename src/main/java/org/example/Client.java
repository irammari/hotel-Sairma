package org.example;

public class Client {
    private int id;
    private String prenom;
    private String nomFamille;
    private String tel;
    private String email;


    public Client( int id, String prenom, String nomFamille, String tel,  String email) {
        this.prenom = prenom;
        this.nomFamille = nomFamille;
        this.tel = tel;
        this.email = email;
    }
}
