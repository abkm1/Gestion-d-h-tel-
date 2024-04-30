package Model;

public class Reservation {
    private Chambre chambre  ;
    private Client client ;
    private String etat;
    static private int ID = 0;
    private  LaDate date_debut;
    private LaDate date_fin;


    public Reservation(Chambre chambre, Client client, LaDate fin ) {
        ID ++ ;
        this.chambre = chambre;
        this.client = client;
        this.etat = "hold";
        this.date_debut = LaDate.aujourdhui() ;
        this.date_fin = fin;
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

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LaDate getDate_debut() {
        return date_debut;
    }

    public LaDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LaDate date_fin) {
        this.date_fin = date_fin;
    }
}
