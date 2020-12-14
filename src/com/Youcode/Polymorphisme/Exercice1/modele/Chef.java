package src.com.Youcode.Polymorphisme.Exercice1.modele;

public class Chef extends Employee {

   private String service;


//Constructor

    public Chef(String nom, String prenom, String ville, int dateDeNaissance, int salaire, String service) {
        super(nom, prenom, ville, dateDeNaissance, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

//Method afficher

    @Override
    public String toString() {
        return "Chef{" +
                "service='" + service + '\'' +
                "} " + super.toString();
    }

    @Override
    public void Afficher() {
        System.out.println(toString());;
    }
}
