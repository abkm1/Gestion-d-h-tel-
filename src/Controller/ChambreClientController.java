package Controller;

import View.ChambreAdminView;
import View.ChambreClientView;
import View.PageAccueilClientView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChambreClientController implements ActionListener {
    ChambreClientView view ;

    public ChambreClientController(ChambreClientView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getButton())
        {
            view.getFrame().dispose();
            new PageAccueilClientView();//hadi capable tcausi prblm ta3 perte de données
        }
    }
}
