package tp7;

public class dictionnaire extends document {
	private String langue;
	public dictionnaire(int numEnreg,String titre,String langue) {
		super(numEnreg, titre);
		this.langue=langue;
	}
	public String getLangue() {
		return this.langue;
	}
	public String toString() {
		return super.toString()+" "+this.langue;
	}
}
