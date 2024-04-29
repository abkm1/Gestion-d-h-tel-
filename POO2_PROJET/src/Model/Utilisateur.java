package Model;

public class Utilisateur {
    protected  String nom ;
    protected String prenom ;
    protected static int IDstatic ;
    protected int Id;
    private String username;
    private String Mdp;

    public Utilisateur (String nom, String prenom ,String username,String Mdp)
    {
        this.nom = nom ;
        this.prenom = prenom ;
        this.Id=IDstatic;
        this.IDstatic++;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getId() {
        return Id;
    }
    public String getUsername() {
        return this.username;
    }

    public String getMdp() {
        return Mdp;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMdp(String mdp) {
        Mdp = mdp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



}
