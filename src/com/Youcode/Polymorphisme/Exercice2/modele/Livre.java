package src.com.Youcode.Polymorphisme.Exercice2.modele;

public class Livre extends Ouvrage {

    private String auteur;


//Constructor
    public Livre(String titre, int dateDeCréation, boolean indicateur, String auteur) {
        super(titre, dateDeCréation, indicateur);
        this.auteur = auteur;
    }

//Getters

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
//Method afficher

    @Override
    public String toString() {
        return "Livre{" +
                "auteur='" + auteur + '\'' +
                "} " + super.toString();
    }

    @Override
    public void afficher() {
        System.out.println(toString());
    }
}
