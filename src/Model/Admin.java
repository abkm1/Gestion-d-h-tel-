package Model;

public class Admin extends Utilisateur{
    public Admin(String nom, String prenom, String password, String username) {
        super(nom, prenom, password, username);
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

    public boolean acceptReservation(Reservation reservation){
        if (reservation.getChambre().isReserved() || reservation.getEtat().equals("declined") ){    //BALAK nzidou ki

            return false;
        }


        reservation.setEtat("accepted");
        reservation.getChambre().setReserved(true);
        return true;

    }

    public void refuseReservation(Reservation reservation){
        if (reservation.getEtat().equals("accepted")){
            return;
        }

        reservation.setEtat("declined");

    }

    public boolean AjouterChambre(int num){
        if (Hotel.getChambres().containsKey(num)) {
            return false;
        }
        Hotel.ajouterChambre(num);
        return true ;
    }
    public boolean SupprimerChambre(int num) {
        if (Hotel.getChambres().containsKey(num) && !Hotel.getChambres().get(num).isReserved()) {
            System.out.println("Deleting room " + num);
            Hotel.supprimerChambre(num);
            System.out.println("Room " + num + " deleted");
            return true;
        }
        return false;
    }


    public void Modifier_Reservation(Reservation reservation, LaDate date){
        if(LaDate.aujourdhui().estApres(date) ){
            System.out.println("This date has already passed");
            return;
        }
        reservation.setDate_fin(date);
    }
}
