package src.com.Youcode.Polymorphisme.Exercice2.modele;

import src.com.Youcode.Polymorphisme.Exercice2.modele.Ouvrage;

public class Video extends Ouvrage {

    private String editeur;
    private double duree;

//Costructor

    public Video(String titre, int dateDeCréation, boolean indicateur, String editeur, double duree) {
        super(titre, dateDeCréation, indicateur);
        this.editeur = editeur;
        this.duree = duree;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

//Getter

    public String getEditeur() {
        return editeur;
    }

//Method afficher

    @Override
    public String toString() {
        return "Video{" +
                "editeur='" + editeur + '\'' +
                ", duree=" + duree +
                "} " + super.toString();
    }

    @Override
    public void afficher() {
        System.out.println(toString());
    }
}
