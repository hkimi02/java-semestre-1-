package tp2_classe;

public class Point {
	private char nom;
	private int abscisse, ordonnee;
	public static int count=0;
	private int num;
	public Point() {
		nom = 'O';
		abscisse = 0;
		ordonnee = 0;
		count++;
		num=count;
	}

	public Point(char a,int abscisse, int ordonnee) {
		this.nom=a;
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
		count ++;
		num=count;
	}

	public Point(Point p1) {
		this.nom = p1.nom;
		this.abscisse = p1.abscisse;
		this.ordonnee = p1.ordonnee;
		count ++;
		num=count;
	}

	public void afficher() {
		System.out.println(nom + "(" + abscisse + "," + ordonnee + ")");
	}

	public void deplacer(int a, int b) {
		abscisse += a;
		ordonnee += b;
	}

	public void reset() {
		abscisse = 0;
		ordonnee = 0;
	}

	public String toString() {
		return this.nom + "(" + this.abscisse + "," + this.ordonnee + ")";
	}

	public boolean coïncide_V1(Point p) {
		return this.abscisse == p.abscisse && this.ordonnee == p.ordonnee;
	}

	public static boolean coincide_V2(Point a, Point b) {
		return a.abscisse == b.abscisse && a.ordonnee == b.ordonnee;
	}
	public  boolean equals(Object p) {
		return (this.abscisse==(((Point )p ).abscisse)) && (this.ordonnee==(((Point )p ).ordonnee));
	}
	public int getAbsicce() {
		return this.abscisse;
	}
	public int getOrdonne() {
		return this.ordonnee;
	}
	public int getNum() {
		return this.num;
	}
	public char getNom() {
		return this.nom;
	}
	public void setAbsicce(int x) {
		this.abscisse=x;
	}
	public void setOrdonne(int y) {
		this.ordonnee=y;
	}
	public void setNom(char p) {
		this.nom=p;
	}
	

}

