package com.Youcode.Heretage.exe3;

public class test {

    public static void main(String[] args) {
        Secretaire Salma = new Secretaire("Salma", "Salouma",1995,"DerbSultan","Casablanca","B5");
        Salma.modifiePersonne("ELmassira","Yousssoufia");
        System.out.println(Salma.getAdresse());
        System.out.println(Salma.getVille());

        System.out.println();

        System.out.println(Salma.toString());

        System.out.println(Salma.ecrirePersonne());
    }
}
