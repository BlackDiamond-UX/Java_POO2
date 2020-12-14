package src.com.Youcode.Polymorphisme.Exercice1.modele;

public class Personne {
    private String nom;
    private String prenom;
    private String ville;
    private int dateDeNaissance;

//Constructor

    public Personne(String nom, String prenom, String ville, int dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(int dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ville='" + ville + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                '}';
    }

    //Method Afficher
    public void Afficher(){
        System.out.println(toString());;
    }

}
