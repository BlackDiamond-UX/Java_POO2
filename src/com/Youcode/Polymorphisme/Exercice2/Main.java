package src.com.Youcode.Polymorphisme.Exercice2;

public class Main {
    public static void main(String[] args) {

        Bibliotheque BB = new Bibliotheque();


//Ouvrages
        Ouvrage Ouvrage1 = BB.ajoutOuvrage("ACE", 1995, true);
        Ouvrage Ouvrage2 = BB.ajoutOuvrage("AGE", 1996, true);



        System.out.println(Ouvrage1.afficher());
        System.out.println(Ouvrage2.afficher());
        System.out.println();
        System.out.println(BB.objects);


        System.out.println("########################################################################################");


//Abonees
        Abonne Abonne1 = BB.ajoutAbonne(777, "Ayoub", 123456, "GOT");
        Abonne Abonne2 = BB.ajoutAbonne(777, "Ahmed", 987657, "LOR");


        System.out.println(Abonne1.afficher());
        System.out.println(Abonne2.afficher());
    }
}
