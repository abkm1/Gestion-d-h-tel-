package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PageAccueilClientView {
    public PageAccueilClientView() {
        JFrame frame = new JFrame();



        JLabel label = new JLabel ("");
        label.setBounds(30,30,350,50);
        label.setText("Bienvenue dans notre hôtel");
        label.setFont(new Font(null, Font.BOLD,25));


        JButton Button1 = new JButton("Réservations");
        JButton Button2 = new JButton("Exit");

        Button1.setFocusable(false);
        Button1.setBounds(30,100,350,50);
        Button1.setBackground(Color.white);
        Button1.setFont(new Font(null,Font.BOLD,20));

        Button2.setFocusable(false);
        Button2.setBounds(30,170,350,50);
        Button2.setBackground(Color.white);
        Button2.setFont(new Font(null,Font.BOLD,20));

        frame.add(label);
        frame.add(Button1);
        frame.add(Button2);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
