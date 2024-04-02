package View  ;

import javax.swing.*;
import java.awt.*;

public class PageAccueilAdminView {
    public PageAccueilAdminView()
    {
        JFrame frame = new JFrame();

        JButton Button1 = new JButton("Réservations");
        JButton Button2 = new JButton("Clients");
        JButton Button3 = new JButton("Chambres");
        JButton Button4 = new JButton("Exit");

        Button1.setFocusable(false);
        Button1.setBounds(30,30,350,50);
        Button1.setBackground(Color.white);
        Button1.setFont(new Font(null,Font.BOLD,20));

        Button2.setFocusable(false);
        Button2.setBounds(30,100,350,50);
        Button2.setBackground(Color.white);
        Button2.setFont(new Font(null,Font.BOLD,20));

        Button3.setFocusable(false);
        Button3.setBounds(30,170,350,50);
        Button3.setBackground(Color.white);
        Button3.setFont(new Font(null,Font.BOLD,20));

        Button4.setFocusable(false);
        Button4.setBounds(30,240,350,50);
        Button4.setBackground(Color.white);
        Button4.setFont(new Font(null,Font.BOLD,20));

        frame.add(Button1);
        frame.add(Button2);
        frame.add(Button3);
        frame.add(Button4);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
