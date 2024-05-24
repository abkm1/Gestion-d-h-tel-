package Controller;

import Model.Admin;
import Model.CurrentAdmin;
import Model.CurrentClient;
import Model.Hotel;
import View.LoginView;
import View.PageAccueilAdminView;
import View.PageAccueilClientView;
import View.SignUpView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {
    LoginView view ;

    public LoginController(LoginView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.getResetButton())
        {
        new SignUpView();
        }
        if(e.getSource()==view.getLoginButton())
        {
            String username = view.getUsernameField().getText();
            String password = String.valueOf(view.getUserPasswordField().getPassword());


            if(Hotel.getUtilisateurs().containsKey(username) && (Hotel.getUtilisateurs().get(username).getpassword().equals(password))) {

                if (Hotel.getUtilisateurs().get(username) instanceof Admin) {
                    CurrentAdmin.username = username;
                    new PageAccueilAdminView();
                } else {
                    CurrentClient.username = username;
                    new PageAccueilClientView();
                }
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Oops, un problème d'authentification","Erreur",JOptionPane.ERROR_MESSAGE);
                view.getUsernameField().setText("");
                view.getUserPasswordField().setText("");
            }
        }
    }
}
