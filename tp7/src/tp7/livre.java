package tp7;

public class livre extends document {
	private String auteur;
	private int nbrPages;
	public livre(int numEnreg,String titre,String auteur,int nbrPages) {
		super(numEnreg,titre);
		this.auteur=auteur;
		this.nbrPages=nbrPages;
	}
	public String getAuteur() {
		return this.auteur;
	}
	public int getNbrPages() {
		return this.nbrPages;
	}
	public String toString() {
		return super.toString()+"-"+this.auteur + " "+this.nbrPages;
	}
}
