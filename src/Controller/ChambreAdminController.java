package Controller;

import View.ChambreAdminView;
import View.PageAccueilAdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChambreController implements ActionListener {
    ChambreAdminView view ;

    public ChambreController(ChambreAdminView view) {
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.getButton1())
        {
            // nakhdmo 3lihom
        }
        if (e.getSource()==view.getButton2())
        {
            // nakhdmo 3lihom
        }
        if (e.getSource()==view.getButton3())
        {
            // nakhdmo 3lihom
        }
        if (e.getSource()==view.getButton4())
        {
            view.getFrame().dispose();
            new PageAccueilAdminView();
        }
    }
}
