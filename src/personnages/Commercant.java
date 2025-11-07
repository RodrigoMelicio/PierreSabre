package personnages;

public class Commercant extends Humains {

	public Commercant(String nom, int qtargent) {
		super(nom, "thé", qtargent);
	}

	public int seFaireExtorquer() {
		int montant = getQtargent();
		perdreArgent(montant);
		parler("Le monde est vraiment trop injuste !");
		return montant;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous !Merci beaucoup. Je vous suis trés reconnaissant");
	}
}
