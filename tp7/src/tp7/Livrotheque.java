package tp7;

public class Livrotheque extends Bibliotheque {
	public Livrotheque(int capacite) {
		super(capacite);
	}
	public boolean ajouter(livre doc) {
		return super.ajouter(doc);
	}
	public livre Livre(int i) {
		return ((livre)super.tabdoc[i]);
	}
	public void afficherAuteurs() {
		int i;
		for(i=0;i<this.nombre;i++) {
			System.out.println("auteur de livre "+tabdoc[i].getTitre()+"est : "+((livre)tabdoc[i]).getAuteur());
		}
	}
}
