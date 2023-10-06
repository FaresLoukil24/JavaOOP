package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Produit {
     int id;
     String libelle;
     String marque;
     double prix;
     Date dateExpiration;

    public Produit() {
    }

    public Produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    public void afficher() {
        System.out.println("Id : " + id);
        System.out.println("Libellé : " + libelle);
        System.out.println("Marque : " + marque);
        System.out.println("Prix : " + prix);
        if (dateExpiration != null) {
            System.out.println("Date d'expiration mta3 produit : " + dateExpiration);
        }
        System.out.println();
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
@Override
    public String toString() {
        return "Id : " + id +
                ", Libellé : " + libelle +
                ", Marque : " + marque +
                ", Prix : " + prix +
                ", Date d'expiration produi : " + (dateExpiration != null ? dateExpiration : "feragh");
    }
    // utilisé toString pour afficher les produits sous forme de chaine de characteres, (exercice 7 que j'ai remarqué)
}