package Controller;

import View.PageAccueilAdminView;
import View.ReservationAdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationController implements ActionListener {
    ReservationAdminView view ;

    public ReservationController(ReservationAdminView view) {
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
