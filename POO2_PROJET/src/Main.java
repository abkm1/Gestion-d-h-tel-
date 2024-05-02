import Model.*;
import View.LoginView;
import View.PageAccueilClientView;
import View.ReservationClientView;

public class Main {
    public static void main (String[] args)
    {

     //creation chambre
        for (int i = 1; i<10;i++){
            Hotel.ajouterChambre(i);
        }




      IDsAndPasswords idsandPasswords = new IDsAndPasswords();
       LoginView login = new LoginView(idsandPasswords.getLoginInfo());
   //  new PageAccueilClientView();
      //new ReservationClientView();

    /*    Client client1= new Client();
        Reservation reservation = new Reservation(new Chambre(1),client1, LaDate.aujourdhui(),new LaDate(1,2,2025));
         Hotel.getReservations().put(reservation.getID(),reservation);
         System.out.println( Hotel.getReservations().toString());*/

    }
}

//utilisateur:  constructor.
//
//Admin:  constructor, accept/decline reservation, creer/supp chambre, modifier status
//
//Client:  constructor, demand reservation,  annulation, modifier,
//
//chambre:    constructor,
//
//reservation:    constructor, date debut, date fin, etat(declined/accepted/en cours), id, chambre, client
//
//hotel: tableauX clientS, adminS, reservationS, chambreS,