package Controller;

import Model.*;
import View.PageAccueilClientView;
import View.ReservationClientView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

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

            Client client = (Client) Hotel.getUtilisateurs().get(CurrentClient.username);

            try {
                if (view.getTextField1().getText().isEmpty() || view.getTextField2().getText().isEmpty() || view.getTextField3().getText().isEmpty() || view.getTextField7().getText().isEmpty() || view.getTextField8().getText().isEmpty() || view.getTextField9().getText().isEmpty() || view.getTextField10().getText().isEmpty()) {
                    throw new Exception("Veuillez remplir tous les champs !");
                }
                try {


                int num = Integer.parseInt(view.getTextField1().getText());
                int j1 = Integer.parseInt(view.getTextField2().getText());
                int j2 = Integer.parseInt(view.getTextField3().getText());
                int m1 = Integer.parseInt(view.getTextField7().getText());
                int a1 = Integer.parseInt(view.getTextField8().getText());
                int m2 = Integer.parseInt(view.getTextField9().getText());
                int a2 = Integer.parseInt(view.getTextField10().getText());

                if (num <= 0 || m2 <= 0 || m1 <= 0 || j2 <= 0 || j1 <= 0 || a1 <= 0 || a2 <= 0 ) {
                    JOptionPane.showMessageDialog(null, "Num(s) invalide(s)", "Error", JOptionPane.ERROR_MESSAGE);
                }

                    LaDate debut = new LaDate(j1,m1,a1);
                    LaDate fin = new LaDate(j2,m2,a2);

                    try {
                        if(!(debut.estAvant(fin) && debut.estApres(LaDate.aujourdhui()))){throw new Exception("les Dates choisies sont inutilisables "); }

                        client.demand(num,debut,fin);

                        System.out.println(Hotel.getReservations().toString());




                    }catch (Exception b){
                        JOptionPane.showMessageDialog(null, b.getMessage());
                    }




             } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "N'utilisez pas de lettres !", "Error", JOptionPane.ERROR_MESSAGE);

             }


            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, a.getMessage());

            }


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
        if(e.getSource()==view.getButton10())
        {
            System.out.println(Hotel.getReservations().toString());

            Map<Integer, Reservation> map = Hotel.getReservations();
            Map<Integer, Reservation> sortedMap = new TreeMap<>(map);

            System.out.println(sortedMap);

            view.getModel2().setRowCount(0);
            for (Map.Entry<Integer, Reservation> entry : sortedMap.entrySet()) {
                if(entry.getValue().getClient().getUsername().equals(CurrentClient.username)) {
                    view.getModel2().addRow(new Object[]{entry.getValue().getChambre().getNumChambre(), entry.getValue().getDate_debut().toString(),entry.getValue().getDate_fin().toString(),entry.getValue().getEtat()});
                }
            }

        }

    }
}
