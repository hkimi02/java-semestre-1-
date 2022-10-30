package tp2_classe;

public class Cercle {
	private Point centre;
	private int rayon;
	public Cercle(Point p,int rayon) {
		this.centre=p;
		this.rayon=rayon;
	}
	public String toString() {
		return "(centre : "+centre.getAbsicce()+","+centre.getOrdonne()+","+"rayon : "+rayon+")";
	}
	public void translater(int dx,int dy) {
		//centre.deplacer(dx, dy);
		centre.setAbsicce(centre.getAbsicce()+dx);
		centre.setOrdonne(centre.getOrdonne()+dy);
	}
	public boolean equals(Object a) {
		Cercle c=(Cercle)a;
		return Point.coincide_V2(this.centre, c.centre) && this.rayon==c.rayon;
	}
	public boolean contains(Point p) {
		return Math.sqrt(Math.pow((p.getAbsicce()-this.centre.getAbsicce()), 2)+p.getOrdonne()-this.centre.getOrdonne())<rayon;
	}
}
