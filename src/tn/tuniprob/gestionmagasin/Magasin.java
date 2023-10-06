package tn.tuniprob.gestionmagasin;
public class Magasin {
    int id;
    String nom;
    String Adresse;
    int capacite;
    Produit[] produits;
    private int nbProduits;


    public Magasin(int identifiant, String adresse, int capacite,String nom) {
        this.id = identifiant;
        this.nom=nom;
        this.Adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[50];
        this.nbProduits = 0;
    }
    public void ajouterProduit(Produit produit) {
        if (nbProduits < capacite) {
            produits[nbProduits] = produit;
            nbProduits++;
        } else {
            System.out.println("Le magasin est plein, impossible d'ajouter plus de produits.");
        }
    }
    public void afficherCaracteristiques() {
        System.out.println("Identifiant du magasin : " + id);
        System.out.println("Nom du magasin : " + nom);
        System.out.println("Adresse du magasin : " + Adresse);
        System.out.println("Capacité du magasin : " + capacite);
        System.out.println("Produits du magasin :");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println("libelle : " + produits[i].libelle + ", Prix : " + produits[i].prix);
        }
    }
}
