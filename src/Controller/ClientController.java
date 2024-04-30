package Controller;

import View.ClientView;
import View.PageAccueilAdminView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
}
