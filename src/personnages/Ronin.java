package personnages;

public class Ronin extends Humains {

	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavourite, int qtargent) {
		super(nom, boissonFavourite, qtargent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int) (getQtargent() * 0.10);

        parler(beneficiaire.getNom() + " prend ces " + don + " sous.");

        perdreArgent(don);          
        beneficiaire.recevoir(don); 
    }
}
