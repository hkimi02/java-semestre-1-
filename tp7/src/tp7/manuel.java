package tp7;

public class manuel extends livre {
	private int niveau;
	public manuel(int numEnreg,String titre,String auteur,int nbrPages,int niveau) {
		super(numEnreg,titre,auteur,nbrPages);
		this.niveau=niveau;
	}
	public int getNiveau() {
		return this.niveau;
	}
	public String toString() {
		return super.toString()+"- niveau : "+this.niveau;
	}
}
