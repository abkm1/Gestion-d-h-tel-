package Model;

public class Chambre {
    public int numChambre;
   private  boolean status ;

    public Chambre(int numChambre,boolean status ) {
        this.numChambre = numChambre;
        this.status = status ;
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
