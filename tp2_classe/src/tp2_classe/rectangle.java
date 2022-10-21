package tp2_classe;

public class rectangle {
private int largeur;
private int longeur;
private Point coin;
public rectangle(Point p,int largeur,int longeur) {
	coin=p;
	this.largeur=largeur;
	this.longeur=longeur;
}
public rectangle(int absicce,int ordonne,char nom,int largeur,int longeur) {
	coin =new Point(nom,absicce,ordonne);
	this.largeur=largeur;
	this.longeur=longeur;
}
public int getLargeur() {
	return this.largeur;
}
public int getLongeur() {
	return this.longeur;
}
public void setLargeur(int largeur) {
	this.largeur=largeur;
}
public void setLongeur(int longeur) {
	this.longeur=longeur;
}
public String toString() {
	return this.coin.getAbsicce()+" "+this.coin.getOrdonne()+" "+this.coin.getNom()+" "+this.largeur+" "+this.longeur;
}
public void afficheRect() {
	System.out.println(this);
}
public static boolean compareRect(Object o1,Object o2) {
	rectangle r1=(rectangle)o1;
	rectangle r2=(rectangle)o2;
	return r1.coin.equals(r2.coin) && r1.largeur==r2.largeur && r1.longeur==r2.longeur;
//	return Point.coincide_V2(r1.coin, r2.coin) && r1.largeur==r2.largeur && r1.longeur==r2.longeur;
}
public void DeplacerRect(int dx, int dy) {
	this.coin.deplacer(dx, dy);
}
}
