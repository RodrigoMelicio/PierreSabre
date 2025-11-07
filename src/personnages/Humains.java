package personnages;

public class Humains {
	private String nom;
	private String boissonFavourite;
	private int qtargent;
	
	public Humains(String nom, String boissonFavourite, int qtargent) {
		this.nom = nom;
		this.boissonFavourite = boissonFavourite;
		this.qtargent = qtargent;
	}

	public String getNom() {
		return nom;
	}

	public int getQtargent() {
		return qtargent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);	
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavourite + "." );
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavourite + " ! GLOUPS !");
	}
	
	
	protected void gagnerArgent(int gain) {
		qtargent += gain;
	}
	
	protected void perdreArgent(int gain) {
		qtargent -= gain;
		if (qtargent < 0) {
			qtargent = 0;
		}
	}
	
	
	public void acheter(String bien, int prix) {
		if (prix <= qtargent) {
			parler("J'ai de l'argent, je peux m'offrir " + bien + ".");
			perdreArgent(prix);
		} else {
			parler("J'ai pas d'argent suffissant pour m'acheter " + bien + ".");
		} 
	}
}
