package tp7;

public class Bibliotheque {
	protected document[] tabdoc;
	protected int nombre;
	public Bibliotheque(int capacite) {
		this.nombre=0;
		this.tabdoc=new document[capacite];
	}
	public void afficherDocuments() {
		int i;
		for(i=0;i<this.nombre;i++) {
			if(tabdoc[i] instanceof livre) {
				System.out.println("un livre : "+tabdoc[i]);
			}
			if(tabdoc[i] instanceof roman) {
				System.out.println("un roman : "+tabdoc[i]);
			}
			if(tabdoc[i] instanceof manuel) {
				System.out.println("un manuel : "+tabdoc[i]);
			}
			if(tabdoc[i] instanceof revue){
				System.out.println("une revue : "+tabdoc[i]);
			}
			if(tabdoc[i] instanceof dictionnaire){
				System.out.println("un dictionnaire : "+tabdoc[i]);
			}
		}
	}
	public document Document (int i) {
		if(i<this.nombre) {
		return this.tabdoc[i];
		}
		return null;
	}
	public boolean ajouter(document doc) {
		if(nombre>this.tabdoc.length) {
			System.out.println("out of bounds");
			return false;
		}
		this.tabdoc[this.nombre]=doc;
		this.nombre++;
		return true;
	}
	public boolean supprimer(document doc) {
		int i;
		if(doc.getNumEnreg()==this.tabdoc[nombre-1].getNumEnreg()) {
			this.tabdoc[nombre-1]=null;
			return true ;
		}
		for(i=0;i<this.nombre;i++) {
			if(tabdoc[i].getNumEnreg()==doc.getNumEnreg()) {
				int j;
				for(j=i;j<this.nombre;j++) {
					tabdoc[j]=tabdoc[j+1];
				}
				this.nombre--;
				return true;
			}
		}
		return false;
	}
	public void afficherAuteurs() {
		int i;
		for(i=0;i<this.nombre;i++) {
			if(tabdoc[i] instanceof livre) {
				System.out.println("auteur de livre "+tabdoc[i].getTitre()+"est : "+((livre)tabdoc[i]).getAuteur());
			}
		}
	}
}
