package Model;

public class Client extends Utilisateur{
    public Client(String nom, String prenom, String ID) {
        super(nom, prenom, ID);
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
    public String getID() {
        return super.getID();
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
    public void setID(String ID) {
        super.setID(ID);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public void DemandeReservation(){

    }

    public void AnnulerReservation(){

    }


}
