package Model;

public class Reservation {
    private Chambre chambre  ;
    private Client client ;

    private static int  ID ;

    public Reservation(Chambre chambre, Client client) {
        ID ++ ;
        this.chambre = chambre;
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
