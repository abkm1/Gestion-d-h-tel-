package Model;

public class Admin extends Utilisateur{
    public Admin(String nom, String prenom,String username , String mdp) {
        super(nom, prenom,username,mdp);
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
        return "Admin{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ID='" + Id + '\'' +
                '}';
    }

    public void Ajouter_Reservation(){}
    public void Modifier_Reservation(){}

    public boolean AccepterReservation(Reservation Rservation ){
        boolean b =false;

        return b;
    }
    public void DeclinerReservation(){

    }
    public void AjouterChambre(){

    }
    public void SupprimerChambre(){

    }
}
