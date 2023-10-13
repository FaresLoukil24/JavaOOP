package GestionMagasin;

public class Caissier extends Employee {
    double tauxDeVente;
    int numeroDeCaisse;
    String prime;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, Double tauxDeVente, int numeroDeCaisse, String prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
        this.tauxDeVente = tauxDeVente;
        this.prime = prime;
    }

    @Override
    public double calculSalaire() {
        return this.nbr_heures-180>0?(this.nbr_heures-180)*5.75+180*5:this.nbr_heures*5;
    }
}
