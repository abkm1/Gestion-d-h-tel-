package Controller;

import View.ChambreView;
import View.PageAccueilAdminView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageAccueilAdminController implements ActionListener {

    PageAccueilAdminView view  ;

    public PageAccueilAdminController(PageAccueilAdminView view) {
        this.view = view;
    }


        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton3())
            {
                view.getFrame().dispose();
                new ChambreView();
            }
            if (e.getSource()==view.getButton4())
            {
                view.getFrame().dispose();
            }
    }
}
