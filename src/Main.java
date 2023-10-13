import GestionMagasin.*;

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
/*
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        System.out.println(prod3.toString());
        Magasin magasin1 = new Magasin(234,"123 Rue de la Magie", 50,"Aziza");

*/
        Magasin magasin1 = new Magasin(1,"CentreVille","Carrefour");
        Magasin magasin2 = new Magasin(2,"Monoprix","Manzah 6");
        magasin1.ajouterProduit(prod1);
        Employee employee1 = new Caissier(1,"Zaineb","afghanisten",10,3.2,5,"0DT");
        magasin1.ajouterEmployee(employee1);
        Employee employee2 = new Caissier(2,"Feres","afghanisten",10,3.2,5,"0DT");
        magasin1.ajouterEmployee(employee2);
        Employee employee3 = new Vendeur(2,"Feres","afghanisten",24);
        magasin1.ajouterEmployee(employee3);
        Employee employee4 = new Responsable(2,"Feres","afghanisten",24,2000);
        magasin1.ajouterEmployee(employee4);
        System.out.println(magasin1);
        magasin1.afficheSalaire();
        magasin1.affichePrimeResponsable();
        magasin1.afficherEmployeeParType();
        System.out.println(magasin2);
    }


}
