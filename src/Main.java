import Model.*;
import View.ChambreAdminView;
import View.LoginView;
import View.PageAccueilClientView;

public class Main {
    public static void main (String[] args)
    {

        Hotel.Start();

        LoginView login = new LoginView();



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