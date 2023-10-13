package GestionMagasin;

public class Vendeur extends Employee{

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures) {
        super(identifiant, nom, adresse, nbr_heures);
    }

    @Override
    public double calculSalaire() {
        return tauxDeVente*450;
    }

}
