package ex1;

public class Point {
private int absicce, ordonne;
private String nom;
private int number=1;
private static int compteur;

public Point (int absicce,int ordonne) {
	this.nom="point";
	this.absicce=absicce;
	this.ordonne=ordonne;
	this.compteur++;
	this.number=this.compteur;
}

public Point() {
	this.nom="O";
	this.absicce=0;
	this.ordonne=0;
}

public Point(Point p) {
	this.nom=p.nom;
	this.absicce=p.absicce;
	this.ordonne=p.ordonne;
}

public void afficher() {
	System.out.println(nom+"(absicce : " + absicce + "ordonne : "+ ordonne + ")");
	
	}
public void deplacer(int a,int b) {
	absicce+=a;
	ordonne+=b;
}
public void reset() {
	absicce=0;
	ordonne=0;
}
public String toString() {
	return this.nom+"("+this.absicce+","+this.ordonne+")";
}
public int getabsicce() {
	return this.absicce;
}

public boolean coïncide_V1 (Point p) {
	if(this.absicce==p.absicce && this.ordonne==p.ordonne) {
		return true;
	}
	else {
		return false ;
	}
}
/*public boolean coïncide_V1 (Point p) {
	return this.absicce==p.absicce && this.ordonne==p.ordonne ;
}*/
public boolean coïncide_V2 (Point p1,Point p2) {
return p1.absicce==p2.absicce && p1.ordonne==p2.ordonne;
}

public static boolean coïncide_V3(Point p1,Point p2) {
	return p1.absicce==p2.absicce && p1.ordonne==p2.ordonne;
}
public int getnumber() {
	return this.number;
}

}

