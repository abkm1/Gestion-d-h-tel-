package Controller;

import Model.*;
import View.PageAccueilAdminView;
import View.ReservationAdminView;

import javax.swing.*;
import java.awt.event.*;
import java.util.Map;
import java.util.TreeMap;

public class ReservationAdminController implements ActionListener {
    ReservationAdminView view ;
    Admin admin;
    int intValue;

    public ReservationAdminController(ReservationAdminView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        admin =  (Admin) Hotel.getUtilisateurs().get(CurrentAdmin.username);

//        view.getTable().addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                // Get the row index at the point of the click
//                int rowIndex = view.getTable().rowAtPoint(e.getPoint());
//                // Get the value of the "Name" column on the clicked row
//                Object id_reservation = view.getTable().getValueAt(rowIndex, 1);
//                intValue = Integer.parseInt(id_reservation.toString());
//
//            }
//        });

        if (e.getSource() == view.getButton3())
        {
            view.getFrame().dispose();
            new PageAccueilAdminView();
        }
        if (e.getSource() == view.getButton1())
        {
            try {
                if (!Hotel.getReservations().containsKey(Integer.parseInt(view.getTextField().getText()))) {
                    throw new Exception("Cette reservation n'existe pas !");
                }
                if (!admin.acceptReservation(Hotel.getReservations().get(Integer.parseInt(view.getTextField().getText())))) {

                    JOptionPane.showMessageDialog(null, "Chambre deja reservee", "Error", JOptionPane.ERROR_MESSAGE);

                }
                Map<Integer, Reservation> map = Hotel.getReservations();
                Map<Integer, Reservation> sortedMap = new TreeMap<>(map);

                view.getModel().setRowCount(0);
                for (Map.Entry<Integer, Reservation> entry : sortedMap.entrySet()) {

                    view.getModel().addRow(new Object[]{entry.getKey(),entry.getValue().getChambre().getNumChambre(), entry.getValue().getClient().getUsername(),entry.getValue().getClient().getNom(),entry.getValue().getClient().getPrenom(),entry.getValue().getEtat()});

                }
            }catch (Exception b){ JOptionPane.showMessageDialog(null,b.getMessage()); }
        }
        if (e.getSource() == view.getButton2())
        {

            try {
                if (!Hotel.getReservations().containsKey(Integer.parseInt(view.getTextField().getText()))) {
                    throw new Exception("Cette reservation n'existe pas !");
                }

                admin.refuseReservation(Hotel.getReservations().get(Integer.parseInt(view.getTextField().getText())));

                Map<Integer, Reservation> map = Hotel.getReservations();
                Map<Integer, Reservation> sortedMap = new TreeMap<>(map);

                view.getModel().setRowCount(0);
                for (Map.Entry<Integer, Reservation> entry : sortedMap.entrySet()) {

                    view.getModel().addRow(new Object[]{entry.getKey(),entry.getValue().getChambre().getNumChambre(), entry.getValue().getClient().getUsername(),entry.getValue().getClient().getNom(),entry.getValue().getClient().getPrenom(),entry.getValue().getEtat()});

                }

            }catch (Exception b){ JOptionPane.showMessageDialog(null,b.getMessage()); }
        }
        if (e.getSource() == view.getButton4())
        {


            Map<Integer, Reservation> map = Hotel.getReservations();
            Map<Integer, Reservation> sortedMap = new TreeMap<>(map);

            view.getModel().setRowCount(0);
            for (Map.Entry<Integer, Reservation> entry : sortedMap.entrySet()) {

                view.getModel().addRow(new Object[]{entry.getKey(),entry.getValue().getChambre().getNumChambre(), entry.getValue().getClient().getUsername(),entry.getValue().getClient().getNom(),entry.getValue().getClient().getPrenom(),entry.getValue().getEtat()});

            }

        }
    }
}
