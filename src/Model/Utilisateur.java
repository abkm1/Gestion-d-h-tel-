package Model;

public class Utilisateur {
    protected  String nom ;
    protected String prenom ;
    protected String ID ;
    protected String username;

    public Utilisateur (String nom, String prenom,String ID, String username)
    {
        this.nom = nom ;
        this.prenom = prenom ;
        this.ID = ID ;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
