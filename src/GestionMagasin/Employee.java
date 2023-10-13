package GestionMagasin;

public abstract class Employee {
    int identifiant;
    double tauxDeVente;
    String nom;
    String adresse;
    int nbr_heures;
    public Employee(int identifiant, String nom, String adresse, int nbr_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }
    public void AfficherEmp() {
        System.out.println("Identifiant du magasin : " + identifiant);
        System.out.println("Nom du Employee : " + nom);
        System.out.println("Adresse du magasin : " + adresse);
        System.out.println("Nombre d'heure : " + nbr_heures);
    }
public String toString(){
        return "id" + identifiant +
                "nom" + nom +
                "adresse" + adresse +
                "nbr heure" + nbr_heures;
}
    public Employee() {

    }
    public abstract double calculSalaire();

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public boolean equals(Object o){
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return this.identifiant == e.getIdentifiant() && this.nom.equals(e.getNom());
        }else {
            return false;
        }


    }
}
