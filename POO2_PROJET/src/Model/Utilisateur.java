package Model;

public class Utilisateur {
    protected  String nom ;
    protected String prenom ;
    protected String ID ;

    public Utilisateur (String nom, String prenom,String ID)
    {
        this.nom = nom ;
        this.prenom = prenom ;
        this.ID = ID ;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getID() {
        return ID;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


}
