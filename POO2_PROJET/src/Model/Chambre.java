package Model;

public class Chambre {
    public static int nbrCh;
    public int numChambre;
    private  boolean status ;

    public Chambre(boolean status ) {

        this.numChambre = nbrCh;
        this.status = status ;
        nbrCh++;

    }



    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
