package Model;

public class Admin extends Utilisateur{
    public Admin(String nom, String prenom, String ID, String username) {
        super(nom, prenom, ID, username);
    }

    public Admin() {
        super();
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
    public String getpassword() {
        return super.getpassword();
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

    public boolean AjouterChambre(int num){
        if (Hotel.getChambres().containsKey(num)) {
            return false;
        }
        Hotel.ajouterChambre(num);
        return true ;
    }
    public boolean  SupprimerChambre(int num){

        if ((Hotel.getChambres().containsKey(num))&&!(Hotel.getChambres().get(num).isReserved())) {
            Hotel.supprimerChambre(num);
            return true;
        }
            return false  ;
    }

    public void Modifier_Reservation(Reservation reservation, LaDate date){
        if(LaDate.aujourdhui().estApres(date) ){
            System.out.println("This date has already passed");
            return;
        }
        reservation.setDate_fin(date);
    }
}
