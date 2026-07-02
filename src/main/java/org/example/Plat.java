package org.example;

import java.util.ArrayList;

public class Plat {
    private int idPlat;
    private String nomPlat;
    private float prixUnitaire;
    private typePlat TypePlat;
    private ArrayList<Ingredient> ingredients;

    public Plat(int idPlat, String nomPlat, float prixUnitaire, typePlat typePlat, ArrayList<Ingredient> ingredients) {
        this.idPlat = idPlat;
        this.nomPlat = nomPlat;
        this.prixUnitaire = prixUnitaire;
        TypePlat = typePlat;
        this.ingredients = ingredients;
    }

    public int getIdPlat() {
        return idPlat;
    }

    public void setIdPlat(int idPlat) {
        this.idPlat = idPlat;
    }

    public String getNomPlat() {
        return nomPlat;
    }

    public void setNomPlat(String nomPlat) {
        this.nomPlat = nomPlat;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public typePlat getTypePlat() {
        return TypePlat;
    }

    public void setTypePlat(typePlat typePlat) {
        TypePlat = typePlat;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Plat{" +
                "idPlat=" + idPlat +
                ", nomPlat='" + nomPlat + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", TypePlat=" + TypePlat +
                ", ingredients=" + ingredients +
                '}';
    }
}
