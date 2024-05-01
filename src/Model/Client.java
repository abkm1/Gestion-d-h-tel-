package Model;

public class Client extends Utilisateur{
    public Client(String nom, String prenom, String password, String utilisateur) {
        super(nom, prenom, password,utilisateur);
    }

    public Client() {
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
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public void demand(int num, LaDate debut, LaDate fin){
        if(!Hotel.getChambres().containsKey(num)){

            return  ;
        }

        Reservation reservation = new Reservation(Hotel.getChambres().get(num),this, debut, fin);
        Hotel.ajouterReservation(reservation);

       // return true ;

    }

    public void annulation (Reservation reservation){
        if(LaDate.aujourdhui().estApres(reservation.getDate_debut())){
            System.out.println("Annulation impossible");
            return;
        }

        reservation.getChambre().setReserved(false);
        Hotel.supprimerReservation(reservation.getID());

    }


}
