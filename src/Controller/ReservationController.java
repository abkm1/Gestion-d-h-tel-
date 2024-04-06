package Controller;

import View.PageAccueilAdminView;
import View.PageAccueilClientView;
import View.ReservationView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationController implements ActionListener {
    ReservationView view ;

    public ReservationController(ReservationView view) {
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
