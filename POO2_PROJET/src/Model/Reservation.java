package Model;

public class Reservation {
    private Chambre chambre  ;
    private Client client ;
    private static int  IDstatic ;
    private int  ID;

    private LaDate DateDebut;
    private LaDate DateFin;

    public Reservation(Chambre chambre, Client client,LaDate DateDebut, LaDate DateFin) {

        this.chambre = chambre;
        this.client = client;
        this.ID=IDstatic;
        DateDebut=  DateDebut;
        DateFin =DateFin;
        this.IDstatic ++ ;
    }

    public static int getIDstatic() {
        return IDstatic;
    }

    public LaDate getDateDebut() {
        return DateDebut;
    }

    public LaDate getDateFin() {
        return DateFin;
    }

    public int getID() {
        return ID;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setDateDebut(LaDate dateDebut) {
        DateDebut = dateDebut;
    }

    public void setDateFin(LaDate dateFin) {
        DateFin = dateFin;
    }

    public void setChambre(Chambre chambre) {this.chambre = chambre;}

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
