package tp2_classe;

public class TestCercle {
	public static void main(String [] args) {
		Point p=new Point('x',1,2);
		Cercle c=new Cercle(p,1);
		Cercle c2=new Cercle(p,2);
		//c2.translater(1,1);
		System.out.println(c+" "+c2);
		System.out.println(c.contains(p));
	}
}
