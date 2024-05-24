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
        reservations.put(reservation.getid(), reservation);
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

    public static void Start(){
        int z;
        for ( z = 1 ; z<11 ; z++){
            Hotel.ajouterChambre(z);
        }

        Client zombozo = new Client("a","a","a","a");
        Hotel.ajouterUtilisateur(zombozo);

        Admin zomozo = new Admin("b","b","b","b");
        Hotel.ajouterUtilisateur(zomozo);
//        Reservation reservation = new Reservation(Hotel.getChambres().get(7),new Client(),new LaDate(7,7,2024),new LaDate(7,8,2024) );
//        Hotel.ajouterReservation(reservation);
//
//        Reservation reservation2 = new Reservation(Hotel.getChambres().get(8),new Client(),new LaDate(7,8,2024),new LaDate(7,10,2024) );
//        Hotel.ajouterReservation(reservation2);
//
//        Reservation reservation3 = new Reservation(Hotel.getChambres().get(8),new Client(),new LaDate(7,9,2024),new LaDate(7,11,2024) );
//        Hotel.ajouterReservation(reservation3);


    }
}