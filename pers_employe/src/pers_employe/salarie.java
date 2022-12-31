package pers_employe;

public class salarie {
	private int matricule;
	private String nom;
	private double recrutement;
	public salarie(int matricule,String nom,double recrutement) {
		this.matricule=matricule;
		this.nom=nom;
		this.recrutement=recrutement;
	}
	public int getMatricule() {
		return this.matricule;
	}
	public String getNom() {
		return this.nom;
	}
	public double getRecrutement() {
		return this.recrutement;
	}
	public void setMatricule(int matricule) {
		this.matricule=matricule;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setRecrutement(double recrutement) {
		this.recrutement=recrutement;
	}
	public void affiche() {
		System.out.println("nom : "+ this.nom + "matricule : "+this.matricule+"recrutement : "+this.recrutement);
	}
	public double salaire() {
		return this.recrutement<2005 ? 400.0 : 280.0;
	}
}
