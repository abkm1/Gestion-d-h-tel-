package Model;

public class Reservation {
    private Chambre chambre  ;
    private Client client ;
    private int IdRservation;
    private static int  ID ;

    public Reservation(Chambre chambre, Client client) {
        this.IdRservation=ID;
        this.chambre = chambre;
        this.client = client;
        ID ++ ;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }
    public int getIdRservation() {
        return IdRservation;
    }
    public Chambre getChambre() {
        return chambre;
    }


}
