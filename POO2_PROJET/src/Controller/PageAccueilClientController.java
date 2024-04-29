package Controller;

import Model.Chambre;
import View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageAccueilClientController implements ActionListener {
    PageAccueilClientView view ;


    public PageAccueilClientController(PageAccueilClientView view) {
        this.view = view;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.getButton1())
        {
            view.getFrame().dispose();
            new ReservationClientView();
        }
        if (e.getSource()==view.getButton2())
        {
            view.getFrame().dispose();
            new ChambreClientView();
        }
        if (e.getSource()==view.getButton3())
        {
            view.getFrame().dispose();
        }
    }
}
