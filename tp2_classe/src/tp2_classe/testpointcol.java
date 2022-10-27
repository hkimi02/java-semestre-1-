package tp2_classe;

public class testpointcol {
    public static void main(String []args) {
    pointcol p=new pointcol();
    p.afficher();
    pointcol p1=new pointcol('a',2,3);
    p1.afficher();
    pointcol p2=new pointcol('a',2,3,100,100,100);
    p2.afficher();
}
}