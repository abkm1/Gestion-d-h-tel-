import Model.IDsAndPasswords;
import View.*;

public class Main {
    public static void main (String[] args)
    {
        //IDsAndPasswords idsandPasswords = new IDsAndPasswords();
   // LoginView login = new LoginView(idsandPasswords.getLoginInfo());
        new PageAccueilClientView();
        new PageAccueilAdminView();
    }
}
