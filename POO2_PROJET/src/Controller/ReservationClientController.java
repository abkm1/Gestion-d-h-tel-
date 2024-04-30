package Controller;

import View.PageAccueilClientView;
import View.ReservationClientView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationClientController implements ActionListener {
    ReservationClientView view ;

    public ReservationClientController(ReservationClientView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.getButton4())
        {
            view.getFrame().dispose();
            new PageAccueilClientView();
        }
    }
}
