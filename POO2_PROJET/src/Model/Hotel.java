package Model;
import java.util.HashMap;
import java.util.Map;
public class Hotel {
    private static  Map<Integer, Chambre> chambres = new HashMap<>();
    private static  Map<Integer, Reservation> reservations = new HashMap<>();
    private static  Map<String, Utilisateur> utilisateurs = new HashMap<>();

    // Méthodes de gestion des chambres
    public static void ajouterChambre(int num) {chambres.put(num, new Chambre(num));}

    public static void supprimerChambre(int numeroChambre) {
        chambres.remove(numeroChambre);
    }

    public static Map<Integer, Chambre> getChambres() {
        return chambres;
    }

    // Méthodes de gestion des réservations
    public static void ajouterReservation(Reservation reservation) {
        reservations.put(reservation.getID(), reservation);
    }

    public static void supprimerReservation(int idReservation) {
        reservations.remove(idReservation);
    }

    public static Map<Integer, Reservation> getReservations() {
        return reservations;
    }

    // Méthodes de gestion des utilisateurs
    public static void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.put(utilisateur.getUsername(), utilisateur);
    }

    public static void supprimerUtilisateur(String username) {
        utilisateurs.remove(username);
    }

    public static Map<String, Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
}