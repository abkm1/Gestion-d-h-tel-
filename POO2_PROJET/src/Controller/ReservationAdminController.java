package Controller;

import View.PageAccueilAdminView;
import View.ReservationAdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationAdminController implements ActionListener {
    ReservationAdminView view ;

    public ReservationAdminController(ReservationAdminView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getButton3())
        {
            view.getFrame().dispose();
            new PageAccueilAdminView();
        }
    }
}
