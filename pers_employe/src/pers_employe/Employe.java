package pers_employe;

public class Employe extends salarie {
	double Hsupp;
	double PHsupp;
	public Employe (int matricule,String nom,double recrutement,double Hsupp,double PHsupp) {
		super(matricule,nom,recrutement);
		this.Hsupp=Hsupp;
		this.PHsupp=PHsupp;
	}
	public double getHsupp() {
		return this.Hsupp;
	}
	public double getPHsupp() {
		return this.PHsupp;
	}
	public void setHsupp(double Hsupp) {
		this.Hsupp=Hsupp;
	}
	public void setPHsupp(double PHsupp) {
		this.PHsupp=PHsupp;
	}
	public void affiche() {
		super.affiche();
		System.out.print("Hsupp : "+this.Hsupp+"PHsupp : "+this.PHsupp);
	}
	public double Salaire() {
		return super.salaire()+this.Hsupp*this.PHsupp;
	}
}
