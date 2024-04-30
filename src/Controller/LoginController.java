package Controller;

import View.LoginView;
import View.PageAccueilAdminView;

import javax.swing.*;
import java.awt.*;
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
            view.getUsernameField().setText("");
            view.getUserPasswordField().setText("");
        }
        if(e.getSource()==view.getLoginButton())
        {
            String username = view.getUsernameField().getText();
            String password = String.valueOf(view.getUserPasswordField().getPassword());


            if(view.getLoginInfo().containsKey(username) && (view.getLoginInfo().get(username).equals(password)))
            {
                view.getFrame().dispose();
                new PageAccueilAdminView();
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
