package Controller;

import View.ChambreView;
import View.PageAccueilAdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChambreController implements ActionListener {
    ChambreView view ;

    public ChambreController(ChambreView view) {
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
