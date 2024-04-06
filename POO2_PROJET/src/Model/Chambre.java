package Model;

public class Chambre {
    public static int numChambre;
    public int numeroCh;
    private  boolean status ;

    public Chambre(boolean status ) {
        this.numeroCh=numChambre;
        this.status = status ;
        numChambre++;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
