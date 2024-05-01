package Controller;

import Model.Admin;
import Model.Client;
import Model.Hotel;
import View.ChambreAdminView;
import View.ClientView;
import View.SignUpView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpController implements ActionListener {
    SignUpView view;
    ClientView view2 ;

    public SignUpController(ClientView view2) {
        this.view2 = view2;
    }

    public SignUpController(SignUpView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==view.getButton1())
        {
            try {
                if (view.getField1().getText().isEmpty() || view.getField2().getText().isEmpty() || view.getField4().getText().isEmpty() || view.getField5().getText().isEmpty()) {
                    throw new Exception("Veuillez remplir tous les champs !");
                }
            try
            {
              if (Hotel.getUtilisateurs().containsKey(view.getField5().getText()))
              {
                  throw new Exception("nom d'utilisateur existe déja ! ");
              }
                try {
                    if (!(view.getField3().getText().equals("zombozo")) && !(view.getField3().getText().isEmpty())){
                        throw new Exception("Code erroné");
                    }
                if (view.getField3().getText().equals("zombozo"))
                {
                    Hotel.ajouterUtilisateur(new Admin(view.getField1().getText(),view.getField2().getText(),view.getField4().getText(),view.getField5().getText()));
                }
                else
                {
                    Hotel.ajouterUtilisateur(new Client(view.getField1().getText(),view.getField2().getText(),view.getField4().getText(),view.getField5().getText()));
                }
                JOptionPane.showMessageDialog(null, "Crée avec succés");
                view.getFrame().dispose();
                }catch (Exception c )
                {
                    JOptionPane.showMessageDialog(null, c.getMessage());
                }
                } catch (Exception b) {
                    JOptionPane.showMessageDialog(null, b.getMessage());
                }
            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, a.getMessage());
                view.getFrame().setVisible(false);
               new SignUpView();
            }
        }
        if (e.getSource()==view.getButton2())
        {
            view.getFrame().dispose();
        }
    }
}
