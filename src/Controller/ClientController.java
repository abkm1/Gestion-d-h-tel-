package Controller;

import Model.Client;
import Model.Hotel;
import Model.Utilisateur;
import View.ClientView;
import View.PageAccueilAdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class ClientController implements ActionListener {
    ClientView view;

    public ClientController(ClientView view)
    {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.getButton1())
        {
            view.getFrame().dispose();
            new PageAccueilAdminView();
        }
        if (e.getSource()==view.getButton2())
        {
            Map<String, Utilisateur> map = Hotel.getUtilisateurs();

            view.getModel().setRowCount(0);
            for (Map.Entry<String, Utilisateur> entry : map.entrySet()) {
                if (entry.getValue() instanceof Client)
                {
                view.getModel().addRow(new Object[]{entry.getKey(),entry.getValue().getNom(),entry.getValue().getPrenom()});
               }
            }
        }
    }
}
