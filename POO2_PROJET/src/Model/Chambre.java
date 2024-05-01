package Model;

public class Chambre {
    public int numChambre;
   private  boolean reserved;

    public Chambre(int numChambre) {
        this.numChambre = numChambre;
        this.reserved = false ;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
