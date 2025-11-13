package personnages;

public class Yakuza extends Humains {
	
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavourite, int qtargent, String clan) {
		super(nom, boissonFavourite, qtargent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		
		int argentvol = victime.seFaireExtorquer();
		gagnerArgent(argentvol);
		reputation++;
		
		parler("J’ai piqué les " + argentvol + " sous de " + victime.getNom() + ", ce qui me fait " + getQtargent() + " sous dans ma poche. Hi ! Hi !");
		
		
	}
	
	
	

}
