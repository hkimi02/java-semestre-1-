package tp7;

public class document {
	private int numEnreg;
	private String titre;
	public document(int numEnreg,String titre) {
		this.numEnreg=numEnreg;
		this.titre=titre;
	}
	public String toString() {
		return this.titre+"[num : "+this.numEnreg+"]";
	}
	public int getNumEnreg() {
		return this.numEnreg;
	}
	public String getTitre() {
		return this.titre;
	}
	
}

