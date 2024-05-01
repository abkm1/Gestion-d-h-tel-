package Model;
import java.util.Calendar;
public class LaDate {
    private int jour;
    private int mois;
    private int annee;

    public LaDate(int jour, int mois, int annee) throws IllegalArgumentException {
        if (mois < 1 || mois > 12) {
            throw new IllegalArgumentException("Le mois doit être compris entre 1 et 12.");
        }

        if (jour < 1 || jour > joursDansMois(mois, annee)) {
            throw new IllegalArgumentException("Le jour doit être compris entre 1 et " + joursDansMois(mois, annee) + " pour le mois spécifié.");
        }

        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Ajout de méthodes pour des fonctionnalités similaires à celles de la classe Date

    public boolean estApres(LaDate autreDate) {
        if (this.annee > autreDate.annee) {
            return true;
        } else if (this.annee == autreDate.annee) {
            if (this.mois > autreDate.mois) {
                return true;
            } else if (this.mois == autreDate.mois) {
                return this.jour > autreDate.jour;
            }
        }
        return false;
    }

    public boolean estAvant(LaDate autreDate) {
        return !estApres(autreDate) && !estEgale(autreDate);
    }

    public boolean estEgale(LaDate autreDate) {
        return this.jour == autreDate.jour && this.mois == autreDate.mois && this.annee == autreDate.annee;
    }



    // Méthode utilitaire pour obtenir le nombre de jours dans un mois donné
    private int joursDansMois(int mois, int annee) {
        switch (mois) {
            case 2:
                return estAnneeBissextile(annee) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    // Méthode utilitaire pour déterminer si une année est bissextile
    private boolean estAnneeBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }

    // Méthode toString pour afficher la date sous forme de chaîne de caractères
    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }

    // Méthode pour obtenir la date d'aujourd'hui
    public static LaDate aujourdhui() {
        Calendar calendrier = Calendar.getInstance();
        int jour = calendrier.get(Calendar.DAY_OF_MONTH);
        int mois = calendrier.get(Calendar.MONTH) + 1; // Les mois dans Calendar commencent à partir de 0
        int annee = calendrier.get(Calendar.YEAR);
        return new LaDate(jour, mois, annee);
    }
}