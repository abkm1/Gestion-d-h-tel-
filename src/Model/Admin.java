package Model;

public class Admin extends Utilisateur{
    public Admin(String nom, String prenom, String ID, String username) {
        super(nom, prenom, ID, username);
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
        return "Admin{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public void acceptReservation(Reservation reservation){
        if (reservation.getChambre().isReserved()){
            System.out.println("this room is already reserved");
            return;
        }
        if(LaDate.aujourdhui().estApres(reservation.getDate_fin()) ){
            System.out.println("you can't accept this reservation");
            return;
        }

        reservation.setEtat("accepted");

    }

    public void refuseReservation(Reservation reservation){
        reservation.setEtat("declined");

    }

    public void AjouterChambre(int num){
        if (Hotel.getChambres().containsKey(num)) {
            System.out.println("this Room already exists");
            return;
        }
        Hotel.ajouterChambre(num);

    }
    public void SupprimerChambre(int num){

        if (Hotel.getChambres().containsKey(num)) {
            Hotel.supprimerChambre(num);
            return;
        }
        System.out.println("this Room doesn't even exist");
    }

    public void Modifier_Reservation(Reservation reservation, LaDate date){
        if(LaDate.aujourdhui().estApres(date) ){
            System.out.println("This date has already passed");
            return;
        }
        reservation.setDate_fin(date);
    }
}
