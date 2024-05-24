package Controller;

import Model.*;
import View.ChambreAdminView;
import View.PageAccueilAdminView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ChambreAdminController implements ActionListener {
    ChambreAdminView view;
    Admin admin;

    public ChambreAdminController(ChambreAdminView view) {
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getButton1()) {
            view.getFrame2().setVisible(true);
        }
        if (e.getSource() == view.getButton2()) {


        }
        if (e.getSource() == view.getButton3()) {
            view.getFrame3().setVisible(true);
        }
        if (e.getSource() == view.getButton4()) {
            view.getFrame().dispose();
            new PageAccueilAdminView();
        }

        if (e.getSource() == view.getButton5()) {
            admin = new Admin();
            try {
                int number = Integer.parseInt(view.getField().getText());
                if (number <= 0) {
                    JOptionPane.showMessageDialog(null, "Entrez un nombre positif", "Error", JOptionPane.ERROR_MESSAGE);
                    view.getField().setText("");
                } else if
                (!admin.AjouterChambre(number)) {
                    JOptionPane.showMessageDialog(null, "la chambre existe déja");
                } else {
                    Map<Integer, Chambre> map = Hotel.getChambres();
                    Map<Integer, Chambre> sortedMap = new TreeMap<>(map);
                    view.getModel().setRowCount(0);
                    for (Map.Entry<Integer, Chambre> entry : sortedMap.entrySet()) {
                        if (entry.getValue().isReserved()) {
                            view.getModel().addRow(new Object[]{entry.getKey(), "Réservée"});
                        } else {
                            view.getModel().addRow(new Object[]{entry.getKey(), "Non Réservée"});
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Entrez un nombre", "Error", JOptionPane.ERROR_MESSAGE);
                view.getField().setText("");
            }
        }

        if (e.getSource() == view.getButton6()) {
            view.getFrame2().dispose();// ikhtiffa lframe2 mor annuler
        }


        if (e.getSource() == view.getButton7()) {
            admin = new Admin();
            int number = Integer.parseInt(view.getField2().getText());
            //System.out.println("Input text: \"" + view.getField() + "\"");
                  try {

                        if (number <= 0) {
                            JOptionPane.showMessageDialog(null, "Entrez un nombre positif", "Error", JOptionPane.ERROR_MESSAGE);
                            view.getField().setText("");
                        } else if
                        (!admin.SupprimerChambre(number)) {
                            JOptionPane.showMessageDialog(null, "Action invalide");
                            System.out.println(Hotel.getChambres().toString());
                        } else {
                            Map<Integer, Chambre> map = Hotel.getChambres();
                            Map<Integer, Chambre> sortedMap = new TreeMap<>(map);
                            view.getModel().setRowCount(0);
                            for (Map.Entry<Integer, Chambre> entry : sortedMap.entrySet()) {
                                if (entry.getValue().isReserved()) {
                                    view.getModel().addRow(new Object[]{entry.getKey(), "Réservée"});
                                } else {
                                    view.getModel().addRow(new Object[]{entry.getKey(), "Non Réservée"});
                                }
                            }
                        }
                  } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Entrez un nombre", "Error", JOptionPane.ERROR_MESSAGE);
                        view.getField().setText("");
                    }

            }

            if (e.getSource() == view.getButton8()) {
                view.getFrame3().dispose();
            }
        }
    }

