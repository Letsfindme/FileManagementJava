
public class Employee {

  String nom;
  String prenom;
  String numSecu;


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

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }


    public Employee(String nom, String prenom) {
        
        this.nom = nom;
        this.prenom = prenom;
    }




}
