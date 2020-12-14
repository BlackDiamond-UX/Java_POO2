package src.com.Youcode.Polymorphisme.Exercice2.test;

import src.com.Youcode.Polymorphisme.Exercice2.modele.Abonne;
import src.com.Youcode.Polymorphisme.Exercice2.modele.Bibliotheque;
import src.com.Youcode.Polymorphisme.Exercice2.modele.Ouvrage;

public class Main {
    public static void main(String[] args) {

        Bibliotheque BB = new Bibliotheque();


//Ouvrages
        Ouvrage Ouvrage1 = BB.ajoutOuvrage("ACE", 1995, true);
        Ouvrage Ouvrage2 = BB.ajoutOuvrage("AGE", 1996, true);



        Ouvrage1.afficher();
        Ouvrage2.afficher();
        System.out.println();
        System.out.println(BB.objects);


        System.out.println("########################################################################################");


//Abonees
        Abonne Abonne1 = BB.ajoutAbonne(777, "Ayoub", 123456, Ouvrage1);
        Abonne Abonne2 = BB.ajoutAbonne(777, "Ahmed", 987657, Ouvrage2);


        Abonne1.afficher();
        Abonne2.afficher();
    }
}
