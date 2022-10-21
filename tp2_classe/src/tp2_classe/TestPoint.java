package tp2_classe;

public class TestPoint {
public static void main(String[] args) {
//	Point p1=new Point();
//	p1.afficher();
//	p1.deplacer(1, -2);
//	p1.afficher();
//	p1.reset();
//	p1.afficher();
	Point p1=new Point('a',3,5);
	p1.setNom('a');
	Point p2=new Point();
	Point p3=new Point(p1);
	p1.afficher();
	p2.afficher();
	p3.afficher();
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
	System.out.println(p1.coïncide_V1(p3));
	System.out.println(Point.coincide_V2(p2, p3));
	System.out.println(Point.count);
	System.out.println(p1.getNum());
	System.out.println(p2.getNum());
	System.out.println(p3.getNum());
	System.out.println(p1.equals(p2));
}
}
