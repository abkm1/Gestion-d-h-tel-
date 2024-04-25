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
        if (e.getSource() == view.getButton1())
        {
         view.getFrame2().setVisible(true);
        }
        if (e.getSource() == view.getButton2())
        {
         view.getFrame4().setVisible(true);
        }
        if (e.getSource() == view.getButton3())
        {
        //tselectionner la ligne oumb3d t3abez 3al button tro7 hadik reservation
        }
        if (e.getSource()==view.getButton4())
        {
            view.getFrame1().dispose();
            new PageAccueilClientView();
        }
        if (e.getSource()==view.getButton5())
        {

        }
        if (e.getSource()==view.getButton6())
        {
            view.getFrame2().dispose();
        }
        if(e.getSource()==view.getButton7())
        {
            view.getFrame3().setVisible(true);
        }
        if(e.getSource()==view.getButton8())
        {
        }
        if(e.getSource()==view.getButton9())
        {

        }

    }
}
