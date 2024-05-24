package Model;

public class Reservation {
    private Chambre chambre  ;
    private Client client ;
    private String etat;
    static private int ID = 0;
    private int id;
    private  LaDate date_debut;
    private LaDate date_fin;


    public Reservation(Chambre chambre, Client client, LaDate debut, LaDate fin ) {
        ID++;
        this.id = ID ;
        this.chambre = chambre;
        this.client = client;
        this.etat = "hold";
        this.date_debut = debut ;
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

    public int getid() {
        return this.id;
    }


    public LaDate getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LaDate date_debut) {
        this.date_debut = date_debut;
    }

    public LaDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LaDate date_fin) {
        this.date_fin = date_fin;
    }
}
