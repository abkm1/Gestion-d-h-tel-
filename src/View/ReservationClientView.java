package View;

import Controller.PageAccueilClientController;
import Controller.ReservationClientController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ReservationClientView {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    JFrame frame  ;

    ImageIcon icon ;
    JScrollPane scrollPane ;
    JTable chambres ;

    Border border ;

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }



    public JButton getButton4() {
        return button4;
    }

    public JFrame getFrame() {
        return frame;
    }

    public ReservationClientView() {
        frame = new JFrame("Réservations");

        icon = new ImageIcon("src/images/5-stars.png");
        frame.setIconImage(icon.getImage());


        String[]Columns = {"Numéro de la chambre","Status"};
        String[][]data = {{"1","Réservée"},{"2","Réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}
                ,{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}
                ,{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}};//hado oumb3d ytbdlo pisk hard code

        chambres = new JTable(data,Columns);
        chambres.setBounds(80,80,100,100);

        scrollPane = new JScrollPane(chambres);
        scrollPane.setBounds(60,60,300,210);

        border = BorderFactory.createLineBorder(new Color(0x857979),2);

        button1 = new JButton ("Ajouter Réservation ");
        button1.setFocusable(false);
        button1.setBounds(30,275,130,50);
        button1.setBackground(new Color (0xD2C6C6));
        button1.setForeground(new Color (0xf));
        button1.setBorder(border);
        button2 = new JButton ("Modifier Réservation");
        button2.setFocusable(false);
        button2.setBounds(165,275,130,50);
        button2.setBackground(new Color (0xD2C6C6));
        button2.setForeground(new Color (0xf));
        button2.setBorder(border);
        button3 = new JButton("Annuler Réservation");
        button3.setFocusable(false);
        button3.setBounds(300,275,130,50);
        button3.setBackground(new Color (0xD2C6C6));
        button3.setForeground(new Color (0xf));
        button3.setBorder(border);
        button4 = new JButton("Menu Principal");
        button4.setFocusable(false);
        button4.setBounds(180,330,100,50);
        button4.setBackground(new Color (0xD2C6C6));
        button4.setForeground(new Color (0xf));
        button4.setBorder(border);

        ReservationClientController controller  = new ReservationClientController(this);
        button1.addActionListener(controller);
        button2.addActionListener(controller);
        button3.addActionListener(controller);
        button4.addActionListener(controller);



        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(scrollPane);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(470,450);
        frame.setLocationRelativeTo(null);
    }
}
