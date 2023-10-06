import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Produit;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Produit prod1 = new Produit(1021, "Lait", "Delice", 0);
        prod1.afficher();

        Produit prod2 = new Produit(2510, "Yaourt", "Vitailait", 0);
        prod2.afficher();

        Produit prod3 = new Produit(3250, "Tomate", "Sicame", 1.200);
        prod3.afficher();

        prod1.setPrix(0.700);
    prod1.afficher();

        prod2.setPrix(0.800);
        prod2.afficher();

        prod3.setDateExpiration(new Date());
        prod3.afficher();

        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        System.out.println(prod3.toString());
        Magasin magasin1 = new Magasin(234,"123 Rue de la Magie", 50,"Aziza");


        magasin1.ajouterProduit(prod1);
        magasin1.afficherCaracteristiques();

    }




}
