package View;

import Controller.PageAccueilClientController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PageAccueilClientView {
    JButton Button1;
    JButton Button2;

    JButton Button3;
    Border border ;
    JFrame frame;

    public JButton getButton1() {
        return Button1;
    }

    public JButton getButton2() {
        return Button2;
    }

    public JButton getButton3() {
        return Button3;
    }



    public JFrame getFrame() {
        return frame;
    }

    public PageAccueilClientView() {
         frame = new JFrame("Menu Principal");

        ImageIcon imageIcon = new ImageIcon("src/images/5-stars.png");
        frame.setIconImage(imageIcon.getImage());

        border = BorderFactory.createLineBorder(new Color(0x857979),2);



        JLabel label = new JLabel ("");
        label.setBounds(20,30,400,50);
        label.setText("Bienvenue dans notre hôtel");
        label.setFont(new Font(null, Font.BOLD,27));


         Button1 = new JButton("Réservations");
         Button2 = new JButton("Exit");


        Button1.setFocusable(false);
        Button1.setBounds(30,100,350,50);
        Button1.setBackground(new Color (0xD2C6C6));
        Button1.setFont(new Font(null,Font.BOLD,20));
        Button1.setBorder(border);

        Button2.setFocusable(false);
        Button2.setBounds(30,170,350,50);
        Button2.setBackground(new Color(0xD2C6C6));
        Button2.setFont(new Font(null,Font.BOLD,20));
        Button2.setBorder(border);


        PageAccueilClientController controller = new PageAccueilClientController(this);

        Button1.addActionListener(controller);
        Button2.addActionListener(controller);


        frame.add(label);
        frame.add(Button1);
        frame.add(Button2);
        frame.setSize(420,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    }
