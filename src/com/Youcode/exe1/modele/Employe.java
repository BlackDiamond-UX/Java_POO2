package src.com.Youcode.exe1.modele;

public class Employe {
    private String nom;
    private String prenom;
    private String adresse;
    private int annee = 2020;
    private int anneeDeNaissance;

    public Employe(String nom, String prenom, String adresse, int anneeDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.anneeDeNaissance = anneeDeNaissance;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getAnneeDeNaissance() {
        return anneeDeNaissance;
    }

    public void setAnneeDeNaissance(int anneeDeNaissance) {
        this.anneeDeNaissance = anneeDeNaissance;
    }

    public int calculerAge(){
        int age = annee - anneeDeNaissance;
        return age;
    }
    public void afficherInfosClient(){
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Annee De Naissance: " + anneeDeNaissance);
        System.out.println("Age: " + calculerAge());

    }
}
