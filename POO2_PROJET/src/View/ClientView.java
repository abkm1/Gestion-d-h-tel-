package View;

import Controller.ClientController;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ClientView {

    JFrame frame;
    JButton button1;
    JButton button2 ;

    public JButton getButton2() {
        return button2;
    }

    public JFrame getFrame() {
        return frame;
    }

    Border border ;

    public JButton getButton1() {
        return button1;
    }

    DefaultTableModel model;

    public DefaultTableModel getModel() {
        return model;
    }

    public void resetModel() {
        this.model =   new DefaultTableModel(new Object[]{"username", "Nom", "Prénom"}, 0);
    }

    JScrollPane scrollPane ;

    JTable table ;

    ImageIcon icon;

    public ClientView() {
        frame = new JFrame("Clients");

        icon = new ImageIcon("src/images/5-stars.png");
        frame.setIconImage(icon.getImage());

        border = BorderFactory.createLineBorder(new Color (0x857979),2);

         model = new DefaultTableModel(new Object[]{"username", "Nom", "Prénom"}, 0);


        table = new JTable(model);


        scrollPane = new JScrollPane(table);

        scrollPane.setBounds(40,50,400,195);

        button1 = new JButton("Menu Principal");
        button1.setBounds(160,255,120,50);
        button1.setBorder(border);
        button1.setBackground(new Color(0xD2C6C6));
        button1.setForeground(Color.black);
        button1.setFocusable(false);

        button2 = new JButton("Show/Refresh");
        button2.setBounds(160,300,120,50);
        button2.setBorder(border);
        button2.setBackground(new Color(0xD2C6C6));
        button2.setForeground(Color.black);
        button2.setFocusable(false);

        ClientController controller = new ClientController (this);
        button1.addActionListener(controller);
        button2.addActionListener(controller);

        frame.add(button1);
        frame.add(button2);
        frame.add(scrollPane);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(480, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
