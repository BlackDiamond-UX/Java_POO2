package src.com.Youcode.Polymorphisme.Exercice2.modele;

public class Ouvrage {
    private String titre;
    private int dateDeCréation;
    private boolean indicateur;

//Constructor


    public Ouvrage(String titre, int dateDeCréation, boolean indicateur) {
        this.titre = titre;
        this.dateDeCréation = dateDeCréation;
        this.indicateur = indicateur;
    }


//Getter
    public String getTitre() {
        return titre;
    }

    public int getDateDeCréation() {
        return dateDeCréation;
    }

    public boolean isIndicateur() {
        return indicateur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDateDeCréation(int dateDeCréation) {
        this.dateDeCréation = dateDeCréation;
    }

    public void setIndicateur(boolean indicateur) {
        this.indicateur = indicateur;
    }

    @Override
    public String toString() {
        return "Ouvrage{" +
                "titre='" + titre + '\'' +
                ", dateDeCréation=" + dateDeCréation +
                ", indicateur=" + indicateur +
                '}';
    }

    //Method Afficher
    public void afficher() {
        System.out.println(toString());
    }
}
