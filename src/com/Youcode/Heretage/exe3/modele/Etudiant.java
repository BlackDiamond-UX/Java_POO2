package src.com.Youcode.Heretage.exe3.modele;

public class Etudiant extends Personne {

    private String diplome;

//Constructor
    public Etudiant(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String diplome) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.diplome = diplome;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
//Method toString

    @Override
    public String toString() {
        return super.toString() + '\'' + "Etudiant{" +
                "diplome='" + diplome + '\'' +
                '}';
    }

    @Override
    public void ecrirePersonne() {

    }
}
