package pers_employe;

public class vendeur extends salarie {
private double vente;
private double Pourcentage;
public vendeur(int matricule,String nom,double recrutement,double vente,double Pourcentage) {
	super(matricule,nom,recrutement);
	this.vente=vente;
	this.Pourcentage=Pourcentage;
}	
public double getVente() {
	return this.vente;
}
public double getPourcentage() {
	return this.Pourcentage;
}
public void setVente(double vente) {
	this.vente=vente;
}
public void setPourcentage(double Pourcentage) {
	this.Pourcentage=Pourcentage;
}
public void affiche() {
	super.affiche();
	System.out.println("vente : "+this.vente+"Pourcentage : "+this.Pourcentage);
}
public double salaire() {
	return super.salaire()+this.vente*this.Pourcentage;
}
}
