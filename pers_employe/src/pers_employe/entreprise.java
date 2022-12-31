package pers_employe;

public class entreprise {
	public static void main(String []args) {
		salarie tabSalarie[]= new salarie [5];
		tabSalarie[0]=new Employe(12345,"walid",2002,15,4);
		tabSalarie[1]=new vendeur(23445,"yassmine",2007,1000,0.1);
		tabSalarie[2]=new vendeur(65478,"Nassime",2000,700,0.1);
		tabSalarie[3]=new Employe(87698,"Aymen",2003,19,5);
		tabSalarie[4]=new Employe(12345,"Khaled",2008,7,4);
		int i;
		System.out.println("liste des employe : ");
		for(i=0;i<tabSalarie.length;i++) {
			if(tabSalarie[i] instanceof Employe) {
				tabSalarie[i].affiche();
			}
		}
		System.out.println("liste des vendeurs : ");
		for(i=0;i<tabSalarie.length;i++) {
			if(tabSalarie[i] instanceof vendeur) {
				tabSalarie[i].affiche();
			}
		}
		int index_ancien=0;
		System.out.println("salaire le plus anceien : ");
		for(i=0;i<tabSalarie.length;i++) {
			if(tabSalarie[i].getRecrutement()<tabSalarie[index_ancien].getRecrutement()) {
				index_ancien=i;
			}}
			tabSalarie[index_ancien].affiche();
			int index_max_salaire=0;
			System.out.println("employe avec salire maximale : ");
			for(i=0;i<tabSalarie.length;i++) {
				if(tabSalarie[i].salaire()>tabSalarie[index_max_salaire].salaire()) {
					index_max_salaire=i;
				}}
				tabSalarie[index_max_salaire].affiche();
				System.out.println(tabSalarie[index_max_salaire].salaire());
		
	}
}
