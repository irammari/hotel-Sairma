package org.example;

public class Hotel {
    private String nom;
    private String adresse;
    private String telephone;
    private String email;
    private List<Chambre> listeChambres;
    private List<Employe> listeEmployes;

    public Hotel(String nom, String adresse, String telephone, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.listeChambres = new ArrayList<>();
        this.listeEmployes = new ArrayList<>();
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Chambre> getListeChambres() { return listeChambres; }
    public List<Employe> getListeEmployes() { return listeEmployes; }

    public void ajouterChambres(Chambre nouvelleChambre) {
        this.listeChambres.add(nouvelleChambre);
        System.out.println("La chambre N°" + nouvelleChambre.getNumeroChambre() + " a bien été ajoutée à l'hôtel.");
    }

    public void afficherChambreDisponible() {
        System.out.println("--- Chambres Disponibles ---");
        boolean chambreTrouvee = false;

        for (Chambre chambre : listeChambres) {
            if ("Libre".equalsIgnoreCase(chambre.getStatut())) {
                System.out.println("Chambre N° : " + chambre.getNumeroChambre() + " (" + chambre.getTypeChambre() + ")");
                chambreTrouvee = true;
            }
        }

        if (!chambreTrouvee) {
            System.out.println("Aucune chambre n'est disponible actuellement.");
        }
    }

    public void recruterEmploye(Employe nouvelEmploye) {
        this.listeEmployes.add(nouvelEmploye);
        System.out.println("L'employé " + nouvelEmploye.getNom() + " " + nouvelEmploye.getPrenom() + " a été recruté avec succès.");
    }

}
