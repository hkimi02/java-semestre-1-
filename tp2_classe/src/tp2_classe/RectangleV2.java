package tp2_classe;

public class RectangleV2 {
	private Point coinGhauche;
	private Point coinDroit;
	public RectangleV2(Point coinGhauche,Point coinDroit) {
		this.coinGhauche=coinGhauche;
		this.coinDroit=coinDroit;
	}
	public Point getCoinGhauche() {
		return this.coinGhauche;
	}
	public Point getCoinDroit() {
		return this.coinDroit;
	}
	public String toString() {
		return "coin gauche : "+this.coinGhauche+"  coin droit : "+this.coinDroit;
	}
	public void afficheRect() {
		System.out.println(this);
	}
	public boolean equals(Object o1) {
		RectangleV2 r1=(RectangleV2)o1;
		return this.coinDroit.equals(r1.coinDroit) &&  this.coinGhauche.equals(r1.coinGhauche);
//		return Point.coincide_V2(r1.coinGhauche, r2.coinGhauche) && Point.coincide_V2(r1.coinDroit, r2.coinGhauche);
	}
	public void DeplacerRect(int dx, int dy) {
		this.coinGhauche.deplacer(dx, dy);
		this.coinDroit.deplacer(dx, dy);
	}
}