package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ClientView {

    JFrame frame;
    JButton button1;

    JButton button2;

    JButton button3;

    public JFrame getFrame() {
        return frame;
    }

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

    JScrollPane scrollPane ;

    JTable table ;

    ImageIcon icon;

    public ClientView() {
        frame = new JFrame("Clients");

        icon = new ImageIcon("src/images/5-stars.png");
        frame.setIconImage(icon.getImage());

        border = BorderFactory.createLineBorder(new Color (0x857979),2);


        String [][] data = {{"0001","Dendani","Safwane"},{"0001","Dendani","Safwane"}
        ,{"0001","Dendani","Safwane"},{"0001","Dendani","Safwane"},{"0001","Dendani","Safwane"}
        ,{"0001","Dendani","Safwane"}};
        String[] cols = {"ID client","Nom","Prénom"};
        table = new JTable(data,cols);

        scrollPane = new JScrollPane(table);

        scrollPane.setBounds(60,50,300,100);

        button1 = new JButton("Menu Principal");
        button1.setBounds(140,155,120,50);
        button1.setBorder(border);
        button1.setBackground(new Color(0xD2C6C6));
        button1.setForeground(Color.black);
        button1.setFocusable(false);

        frame.add(button1);
        frame.add(scrollPane);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(420, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
