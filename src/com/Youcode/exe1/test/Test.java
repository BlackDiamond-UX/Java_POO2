package src.com.Youcode.exe1.test;

import src.com.Youcode.exe1.modele.Employe;

public class Test {
    public static void main(String[] args) {
        Employe Ayoub = new Employe("ROUIHA", "Ayoub", "Youssoufia", 1995);
        System.out.println(Ayoub.calculerAge());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Ayoub.afficherInfosClient();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }



}
