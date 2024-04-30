package Model;

public class Client extends Utilisateur{
    public Client(String nom, String prenom, String username , String mdp) {
        super(nom, prenom,mdp,mdp);
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public String getPrenom() {
        return super.getPrenom();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom);
    }

    @Override
    public void setPrenom(String prenom) {
        super.setPrenom(prenom);
    }



    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ID='" + Id + '\'' +
                '}';
    }
}
