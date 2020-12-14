package src.com.Youcode.Heretage.exe3.modele;

import src.com.Youcode.Heretage.exe3.modele.Personne;

public class Secretaire extends Personne {

    private String numeroBureau;

//Constructor
    public Secretaire(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String numeroBureau) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.numeroBureau=numeroBureau;
    }

    public String getNumeroBureau() {
        return numeroBureau;
    }

    public void setNumeroBureau(String numeroBureau) {
        this.numeroBureau = numeroBureau;
    }
//Method toString

    @Override
    public String toString() {
        return super.toString() + '\'' + "Secretaire{" +
                "Num de Bureau='" + numeroBureau + '\'' +
                '}';
    }

    @Override
    public void ecrirePersonne() {
        System.out.println("classe Secretaire");

    }
}
