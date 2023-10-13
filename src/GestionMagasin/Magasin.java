package GestionMagasin;

import java.util.Arrays;

public class Magasin {
    int id;
    String nom;
    String Adresse;
    int capacite;
    Produit[] produits;
    private int nbProduits;
    private int nbEmployees;
    Employee[] employees;
    int capaciteEmp;


    public Magasin(int identifiant, String adresse, String nom) {
        this.id = identifiant;
        this.nom = nom;
        this.Adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[50];
        this.employees = new Employee[20];
        this.nbProduits = 0;
        this.nbEmployees = 0;
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
        System.out.println("employees=" + Arrays.toString(employees)
        );
        System.out.println("Capacité du magasin : " + capacite);

        for (int i = 0; i < nbEmployees; i++) {
            System.out.println("nom employee : " + employees[i].nom);
        }
        System.out.println("Produits du magasin :");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println("libelle : " + produits[i].libelle + ", Prix : " + produits[i].prix);
        }
    }

    @Override
    public String toString() {
            return "Magasin{" +
                    "id=" + id +
                    ", nom='" + nom + '\'' +
                    ", Adresse='" + Adresse + '\'' +
                    ", capacite=" + capacite +
                    ", produits=" + Arrays.toString(produits) +
                    ", nbProduits=" + nbProduits +
                    ", nbEmployees=" + nbEmployees +
                    ", employees=" + Arrays.toString(employees) +
                    '}';
    }
    public void ajouterEmployee(Employee employee) {
        if (capacite < employees.length) {
            employees[capacite] = employee;
            capaciteEmp++;
        } else {
            System.out.println("pas d'espacce ");
        }
    }
    public void afficheSalaire() {
        System.out.println("- Magasin " + this.id + "-");
        for (int i = 0; i < capacite; i++) {
            System.out.println(employees[i].calculSalaire());
        }
    }
    public void affichePrimeResponsable() {
        System.out.println("-Prime - Magasin  " + this.id + "-");
        for (int i = 0; i < capacite; i++) {
            if (employees[i] instanceof Responsable)
                System.out.println(((Responsable) employees[i]).getPrime());
        }

    }
    public void afficherEmployeeParType() {
        int countResponsable = 0;
        int countCaissier = 0;
        int countVendeur = 0;
        for (int i = 0; i < capacite; i++) {
            if (employees[i] instanceof Responsable)
                countResponsable++;
            else if (employees[i] instanceof Vendeur) {
                countVendeur++;
            } else if (employees[i] instanceof Caissier) {
                countCaissier++;
            }
        }
        System.out.println("-Magasin "+this.id+" -");
        System.out.println("Nbr Responsable = "+ countResponsable);
        System.out.println("Nbr Vendeur = "+ countVendeur);
        System.out.println("Nbr Caissier = "+ countCaissier);

    }
}
