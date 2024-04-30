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

    JButton button5;
    JButton button6;
    JButton button7;

    JButton button8;
    JButton button9;

    JFrame frame1  ;
    JFrame frame2  ;
    JFrame frame3  ;

    JFrame frame4  ;

    JTextField textField1;
    JTextField textField2;
    JTextField textField3;

    JTextField textField4;
    JTextField textField5;
    JTextField textField6;

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;

    ImageIcon icon ;
    JScrollPane scrollPane1 ;
    JScrollPane scrollPane2;
    JTable chambres ;
    JTable reserv ;

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

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public JButton getButton7() {return button7;}

    public JButton getButton8() {return button8;}

    public JButton getButton9() {return button9;}

    public JFrame getFrame1() {
        return frame1;
    }

    public JFrame getFrame2() {
        return frame2;
    }

    public JFrame getFrame3() {return frame3;}
    public JFrame getFrame4() {return frame4;}

    public ReservationClientView() {
        frame1 = new JFrame("Réservations");
        frame2 = new JFrame("Demander réservation");
        frame3 = new JFrame("Voir Réservations");
        frame4 = new JFrame("Modifier réservation");

        icon = new ImageIcon("src/images/5-stars.png");
        frame1.setIconImage(icon.getImage());
        frame2.setIconImage(icon.getImage());
        frame3.setIconImage(icon.getImage());
        frame4.setIconImage(icon.getImage());


        String[]Columns = {"Numéro de la chambre","Status"};
        String[][]data = {{"1","Réservée"},{"2","Réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}
                ,{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}
                ,{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}};//hado oumb3d ytbdlo pisk hard code

        chambres = new JTable(data,Columns);
        chambres.setBounds(80,80,100,100);

        scrollPane1 = new JScrollPane(chambres);
        scrollPane1.setBounds(60,60,300,210);

        border = BorderFactory.createLineBorder(new Color(0x857979),2);

        button1 = new JButton ("Demander Réservation ");
        button1.setFocusable(false);
        button1.setFont(new Font(null,Font.BOLD,12));
        button1.setBounds(30,275,180,50);
        button1.setBackground(new Color (0xD2C6C6));
        button1.setForeground(new Color (0xf));
        button1.setBorder(border);
        button2 = new JButton ("Modifier Réservation");
        button2.setFocusable(false);
        button2.setBounds(275,190,160,50);
        button2.setBackground(new Color (0xD2C6C6));
        button2.setForeground(new Color (0xf));
        button2.setBorder(border);
        button3 = new JButton("Annuler Réservation");
        button3.setFocusable(false);
        button3.setBounds(445,190,160,50);
        button3.setBackground(new Color (0xD2C6C6));
        button3.setForeground(new Color (0xf));
        button3.setBorder(border);
        button4 = new JButton("Menu Principal");
        button4.setFocusable(false);
        button4.setBounds(135,330,180,50);
        button4.setBackground(new Color (0xD2C6C6));
        button4.setForeground(new Color (0xf));
        button4.setBorder(border);




        button7 = new JButton("Voir Réservations");
        button7.setBorder(border);
        button7.setBounds(220,275,180,50);
        button7.setBackground(new Color (0xD2C6C6));
        button7.setForeground(new Color (0xf));
        button7.setFocusable(false);




        frame1.add(button1);
        frame1.add(button4);
        frame1.add(button7);
        frame1.add(scrollPane1);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setSize(470,450);
        frame1.setLocationRelativeTo(null);

        JLabel label1 = new JLabel("Numéro de la chambre: ");
        JLabel label2 = new JLabel("Date de début de la réservation: ");
        JLabel label3 = new JLabel("Date de fin de la réservation: ");



        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();

        label1.setBounds(20,18,250,50);
        textField1.setBounds(160,29,150,25);
        label2.setBounds(20,56,250,50);
        textField2.setBounds(204,68,150,25);
        label3.setBounds(20,94,250,50);
        textField3.setBounds(185,107,150,25);

        //kayn probleme hna rahom ykhtafiw hado
        frame2.add(label1);
        frame2.add(textField1);
        frame2.add(label2);
        frame2.add(textField2);
        frame2.add(label3);
        frame2.add(textField3);

        button5 = new JButton("Ok");
        button5.setBorder(border);
        button5.setBounds(180,140,80,25);
        button5.setBackground(new Color (0xD2C6C6));
        button5.setForeground(new Color (0xf));
        button5.setFocusable(false);

        button6 = new JButton("Annuler");
        button6.setBorder(border);
        button6.setBounds(270,140,80,25);
        button6.setBackground(new Color (0xD2C6C6));
        button6.setForeground(new Color (0xf));
        button6.setFocusable(false);
        frame2.add(button5);
        frame2.add(button6);


        frame2.setResizable(false);
        frame2.setLayout(null);
        frame2.setVisible(false);
        frame2.setSize(500,230);
        frame2.setLocationRelativeTo(null);

        String[]Columns2 = {"Numéro de la chambre","Date de début de Réservation","Date de fin de réservation","Etat de demande"};
        String[][]data2 = {{"1","1/2/2024","2/2/2024","Accepté"},{"1","1/2/2024","2/2/2024","Accepté"},{"1","1/2/2024","2/2/2024","Accepté"},{"1","1/2/2024","2/2/2024","Accepté"},{"1","1/2/2024","2/2/2024","Accepté"},{"1","1/2/2024","2/2/2024","Accepté"},{"1","1/2/2024","2/2/2024","Accepté"},
                {"1","1/2/2024","2/2/2024","Accepté"}};

        reserv = new JTable(data2,Columns2);
        scrollPane2 = new JScrollPane(reserv);
        scrollPane2.setBounds(30,80,800,100);
        frame3.add(scrollPane2);


        frame3.add(button2);
        frame3.add(button3);
        frame3.setResizable(false);
        frame3.setLayout(null);
        frame3.setVisible(false);
        frame3.setSize(900,400);
        frame3.setLocationRelativeTo(null);

        JLabel label4 = new JLabel("Numéro de la chambre: ");
        JLabel label5 = new JLabel("Date de début de la réservation: ");
        JLabel label6 = new JLabel("Date de fin de la réservation: ");


        textField4 = new JTextField();
        textField5= new JTextField();
        textField6 = new JTextField();

        label4.setBounds(20,18,250,50);
        textField4.setBounds(160,29,150,25);
        label5.setBounds(20,56,250,50);
        textField5.setBounds(204,68,150,25);
        label6.setBounds(20,94,250,50);
        textField6.setBounds(185,107,150,25);

        button8 = new JButton("Ok");
        button8.setBorder(border);
        button8.setBounds(180,140,80,25);
        button8.setBackground(new Color (0xD2C6C6));
        button8.setForeground(new Color (0xf));
        button8.setFocusable(false);

        button9 = new JButton("Annuler");
        button9.setBorder(border);
        button9.setBounds(270,140,80,25);
        button9.setBackground(new Color (0xD2C6C6));
        button9.setForeground(new Color (0xf));
        button9.setFocusable(false);


        frame4.add(label4);
        frame4.add(textField4);
        frame4.add(label5);
        frame4.add(textField5);
        frame4.add(label6);
        frame4.add(textField6);
        frame4.add(button8);
        frame4.add(button9);
        frame4.setResizable(false);
        frame4.setLayout(null);
        frame4.setVisible(false);
        frame4.setSize(500,230);
        frame4.setLocationRelativeTo(null);

        ReservationClientController controller  = new ReservationClientController(this);
        button1.addActionListener(controller);
        button2.addActionListener(controller);
        button3.addActionListener(controller);
        button4.addActionListener(controller);
        button5.addActionListener(controller);
        button6.addActionListener(controller);
        button7.addActionListener(controller);

    }
}
