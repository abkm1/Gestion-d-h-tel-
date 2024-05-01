package Model;

public class Utilisateur {
    protected  String nom ;
    protected String prenom ;
    protected String password ;
    protected String username;

    public Utilisateur (String nom, String prenom,String password, String username)
    {
        this.nom = nom ;
        this.prenom = prenom ;
        this.password = password ;
        this.username = username;
    }

    public Utilisateur() {

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getpassword() {
        return password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Utilisateur getUtilisateur ()
    {
        return this ;
    }
}
