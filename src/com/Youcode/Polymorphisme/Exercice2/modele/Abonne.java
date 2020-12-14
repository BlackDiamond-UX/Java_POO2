package src.com.Youcode.Polymorphisme.Exercice2.modele;

public class Abonne {
    private int id;
    private String nom;
    private int numAbonnement;
    private Ouvrage ouvrage;

//Constructor

    public Abonne(int id, String nom, int numAbonnement, Ouvrage ouvrage) {
        this.id = id;
        this.nom = nom;
        this.numAbonnement = numAbonnement;
        this.ouvrage = ouvrage;
    }


// Getters

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNumAbonnement() {
        return numAbonnement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumAbonnement(int numAbonnement) {
        this.numAbonnement = numAbonnement;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }
    //Method Afficher


    @Override
    public String toString() {
        return "Abonne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", numAbonnement=" + numAbonnement +
                ", ouvrage=" + ouvrage +
                '}';
    }

    public void afficher() {
        System.out.println(toString());
    }
}
