package tp7;

public class testDocuments {
	public static void main(String []args) {
//		document doc=new document(1001,"les chtis");
//		livre liv=new livre(1002,"nicolas sarkosy,le manuel vaudou","nicolas sarkouzy",500);
//		roman rom=new roman(1003,"l'instinc de mort","j.mesrine",150,10);
//		manuel man=new manuel(1004,"vive le java","a. metral-boitel",200,2);
//		revue rev=new revue(1005,"science et vie",4,2008);
//		dictionnaire dic=new dictionnaire(1006,"larouse","francais");
//		System.out.println("bienvenue chez : "+doc.toString());
//		System.out.println("un livre : "+liv.toString());
//		System.out.println("un roman : "+rom.toString());
//		System.out.println("un manuel : "+man.toString());
//		System.out.println("une revue : "+rev.toString());
//		System.out.println("un dictionnaire : "+dic.toString());
		
		Bibliotheque Bibliotheque = new Bibliotheque(50);

		 document unDocument = new roman(1003,"Compte rendu du TP2","Roman.GONCOURT",20,10);
		 Bibliotheque.ajouter(new document(1001, "Je n'ai plus d'idee"));
		 Bibliotheque.ajouter(new livre(1002,"nicolas sarkosy,le manuel vaudou","nicolas sarkouzy",500));
		 Bibliotheque.ajouter(unDocument);
		 Bibliotheque.ajouter(new manuel(1004,"vive le java","a. metral-boitel",200,2));
		 Bibliotheque.ajouter(new revue(1005,"science et vie",4,2008));
		 Bibliotheque.ajouter(new dictionnaire(1006,"larouse","francais"));

		 System.out.println("--------------DOCUMENTS---------------------");
		 Bibliotheque.afficherDocuments();
		 System.out.println("-------------------------------------------");
		 System.out.println("---------------AUTEURS----------------------");
		 Bibliotheque.afficherAuteurs();
		 System.out.println("----------------END-------------------------");

		 System.out.println("-----DOCUMENTS SANS LE NUM 1003-------------");
		 Bibliotheque.supprimer(unDocument);
		 Bibliotheque.afficherDocuments();
		 System.out.println("----------------------END------------------");
	}
}
