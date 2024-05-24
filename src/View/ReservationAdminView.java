package View;

import Controller.ReservationAdminController;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;

public class ReservationAdminView {

    JFrame frame ;

    Border border ;
    JButton button1;

    public JFrame getFrame() {
        return frame;
    }

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

    JButton button2;

    JButton button3 ;

    JButton button4;

    JTextField textField;

    public JTextField getTextField(){
        return textField;
    }

    public JTable getTable() {
        return table;
    }

    JTable table ;
    JScrollPane scrollPane ;

    ImageIcon icon ;

    DefaultTableModel model ;

    public DefaultTableModel getModel() {
        return model;
    }

    public ReservationAdminView()
    {
        frame = new JFrame ("Réservations");
        icon = new ImageIcon("src/images/5-stars.png");
        frame.setIconImage(icon.getImage());


        model = new DefaultTableModel(new Object[]{"ID Réservation","Num chambre","Client","Nom","Prénom","Etat de la demande"},0);

        table = new JTable(model);


        TableColumn column1 = table.getColumnModel().getColumn(1);
        column1.setPreferredWidth(140);








        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100,50,800,230);


        border = BorderFactory.createLineBorder(new Color (0x857979),2);

        textField = new JTextField();
        textField.setBounds(240,290,120,50);



        button1 = new JButton("Accepter");
        button1.setBounds(370,290,120,50);
        button1.setBorder(border);
        button1.setBackground(new Color(0xD2C6C6));
        button1.setForeground(Color.black);
        button1.setFocusable(false);


        button2 = new JButton("Décliner");
        button2.setBounds(500,290,120,50);
        button2.setBorder(border);
        button2.setBackground(new Color(0xD2C6C6));
        button2.setForeground(Color.black);
        button2.setFocusable(false);



        button3 = new JButton("Menu Principal");
        button3.setBounds(440,345,120,50);
        button3.setBorder(border);
        button3.setBackground(new Color(0xD2C6C6));
        button3.setForeground(Color.black);
        button3.setFocusable(false);

        button4 = new JButton("Refresh");
        button4.setBounds(300,345,120,50);
        button4.setBorder(border);
        button4.setBackground(new Color(0xD2C6C6));
        button4.setForeground(Color.black);
        button4.setFocusable(false);

        ReservationAdminController controller = new ReservationAdminController(this);
        button1.addActionListener(controller);
        button2.addActionListener(controller);
        button3.addActionListener(controller);
        button4.addActionListener(controller);



        frame.add(scrollPane);
        frame.add(textField);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000,450);
        frame.setLocationRelativeTo(null);
    }
}
