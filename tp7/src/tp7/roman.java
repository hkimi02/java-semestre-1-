package tp7;

public class roman extends livre {
	private float prixLitt;
	public roman(int numEnreg,String titre,String auteur,int nbrPages,float prixLitt) {
		super(numEnreg,titre,auteur,nbrPages);
		this.prixLitt=prixLitt;
	}
	public float getPrixLitt() {
		return this.prixLitt;
	}
	public String toString() {
		return super.toString();
	}
}
