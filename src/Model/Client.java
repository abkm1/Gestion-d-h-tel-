package Model;

public class Client extends Utilisateur{
    public Client(String nom, String prenom, String ID, String utilisateur) {
        super(nom, prenom, ID,utilisateur);
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

    public void demand(int num){
        if(!Hotel.getChambres().containsKey(num)){
            System.out.println("this room doesn't exist");
            return;/// but we can build JUST FOR YOU if you a small fee :D
        }

        LaDate date = null; // njibouha mn l input

        Reservation reservation = new Reservation(Hotel.getChambres().get(num),this, date);

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
