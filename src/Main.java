import Model.IDsAndPasswords;
import View.*;

public class Main {
    public static void main (String[] args)
    {
       IDsAndPasswords idsandPasswords = new IDsAndPasswords();
    LoginView login = new LoginView(idsandPasswords.getLoginInfo());
    new PageAccueilClientView();
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