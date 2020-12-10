package com.Youcode.Heretage.exe2;

import com.Youcode.Heretage.exe2.CompteBancaire;
import com.Youcode.Heretage.exe2.CompteCourant;
import com.Youcode.Heretage.exe2.CompteEpargne;

public class test {
    public static void main(String[] args) {

        System.out.println("Classe CompteBancaire Solution");
        System.out.println();
        CompteBancaire Compte1 = new CompteBancaire(987654321, 500);
        Compte1.ajouter();

        System.out.println();

        Compte1.retirer();

        System.out.println();
        System.out.println();

        Compte1.afficher();


        System.out.println();
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Classe CompteEpargne Solution");
        System.out.println();

        CompteEpargne Compte2 = new CompteEpargne(987654321, 100);
        Compte2.afficher();
        Compte2.tauxIntérêtAnnuel();

        System.out.println();
        System.out.println("#############################################################");
        System.out.println("Classe CompteCourant Solution");
        System.out.println();

        CompteCourant Compte3 = new CompteCourant(5432155, 10);
        Compte3.afficher();
    }
}
