package GestionMagasin;

public class Responsable extends Employee{
    double prime;
    public Responsable(int identifiant, String nom, String adresse, int nbr_heures,double prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime=prime;
    }

    @Override
    public double calculSalaire() {
        return this.nbr_heures-160>0?(this.nbr_heures-160)*12+160*10+prime:this.nbr_heures*10+prime;
    }

    public double getPrime() {
        return prime;
    }
}
