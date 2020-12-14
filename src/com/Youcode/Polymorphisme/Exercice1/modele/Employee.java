package src.com.Youcode.Polymorphisme.Exercice1.modele;

public class Employee extends Personne {

   private int salaire;

//Constructor
    public Employee(String nom, String prenom, String ville, int dateDeNaissance, int salaire) {
        super(nom, prenom, ville, dateDeNaissance);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "salaire=" + salaire +
                "} " + super.toString();
    }

    //method Afficher
    @Override
    public void Afficher() {
        System.out.println(toString());;
    }
}
