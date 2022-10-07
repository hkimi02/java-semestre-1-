package tp2_classe;

public class Point {
	private char nom;
	private int abscisse, ordonnee;

	public Point() {
		nom = 'O';
		abscisse = 0;
		ordonnee = 0;
	}

	public Point(int abscisse, int ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	public Point(Point p1) {
		this.nom = p1.nom;
		this.abscisse = p1.abscisse;
		this.ordonnee = p1.ordonnee;
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
}
