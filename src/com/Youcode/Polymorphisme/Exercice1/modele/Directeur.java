package src.com.Youcode.Polymorphisme.Exercice1.modele;

import src.com.Youcode.Polymorphisme.Exercice1.modele.Chef;

public class Directeur extends Chef {

    private String societe;

    public Directeur(String nom, String prenom, String ville, int dateDeNaissance, int salaire, String service, String societe) {
        super(nom, prenom, ville, dateDeNaissance, salaire, service);
        this.societe = societe;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    @Override
    public String toString() {
        return "Directeur{" +
                "societe='" + societe + '\'' +
                "} " + super.toString();
    }

    @Override
    public void Afficher() {
        System.out.println(toString());
    }
}
