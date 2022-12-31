package tp7;

public class revue extends document {
	private int mois;
	private int annee;
	public revue(int numEnreg,String titre,int mois,int annee) {
		super(numEnreg,titre);
		this.mois=mois;
		this.annee=annee;
	}
	public int getMois() {
		return this.mois;
	}
	public int getAnnee() {
		return this.annee;
	}
	public String toString() {
		return super.toString()+" "+this.mois+"/"+this.annee;
	}
}
