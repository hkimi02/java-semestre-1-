package tp2_classe;

public class pointcol extends Point {
    private int composRouge;
    private int composVerte;
    private int composBleu;
    public pointcol() {
       super();
       composBleu=0;
       composRouge=0;
       composVerte=0;
    }
    public pointcol(char nom,int absicce,int ordonne,int composRouge,int composVerte,int composBleu) {
        super(nom,absicce,ordonne);
        if(!(composRouge > 255 || composRouge<0 && composVerte > 255 || composVerte<0 && composBleu > 255 || composBleu<0)) {
        this.composBleu=composBleu;
        this.composRouge=composRouge;
        this.composVerte=composVerte;
     }
        else{
            System.out.println("valeur de couleur doit etre entre 0 et 255");
        }
        }
    public pointcol(char nom,int absicce,int ordonne) {
        super(nom,absicce,ordonne);
        composBleu=0;
        composRouge=0;
        composVerte=0;
     }
    
    public void chengerCouleur(int composRouge,int composVerte,int composBleu) {
           this.composRouge=composRouge;
           this.composVerte=composVerte;
           this.composBleu=composBleu;
    }
    public void afficher() {
        super.afficher();
         System.out.println( " " +"(R="+ this.composRouge+"; V="+this.composVerte+"; B="+this.composBleu+")");
    }
}
