package View  ;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.PageAccueilAdminController;

public class PageAccueilAdminView  {
    JFrame frame;
    JButton Button1;

    JButton Button2;
    JButton Button3;
    JButton Button4;
    Border border ;

    public JFrame getFrame() {
        return frame;
    }

    public JButton getButton1() {
        return Button1;
    }

    public JButton getButton2() {
        return Button2;
    }

    public JButton getButton3() {
        return Button3;
    }

    public JButton getButton4() {
        return Button4;
    }
    public PageAccueilAdminView()
    {
         frame = new JFrame("Menu Principal");

         ImageIcon imageIcon = new ImageIcon("src/images/5-stars.png");
         frame.setIconImage(imageIcon.getImage());

         Button1 = new JButton("Réservations");
         Button2 = new JButton("Clients");
         Button3 = new JButton("Chambres");
         Button4 = new JButton("Exit");

        border = BorderFactory.createLineBorder(new Color(0x857979),2);


        PageAccueilAdminController controller = new PageAccueilAdminController(this);
        Button1.addActionListener(controller);
        Button2.addActionListener(controller);
        Button3.addActionListener(controller);
        Button4.addActionListener(controller);



        Button1.setFocusable(false);
        Button1.setBounds(30,30,350,50);
        Button1.setBackground(new Color (0xD2C6C6));
        Button1.setFont(new Font(null,Font.BOLD,20));
        Button1.setBorder(border);

        Button2.setFocusable(false);
        Button2.setBounds(30,100,350,50);
        Button2.setBackground(new Color(0xD2C6C6));
        Button2.setFont(new Font(null,Font.BOLD,20));
        Button2.setBorder(border);

        Button3.setFocusable(false);
        Button3.setBounds(30,170,350,50);
        Button3.setBackground(new Color(0xD2C6C6));
        Button3.setFont(new Font(null,Font.BOLD,20));
        Button3.setBorder(border);

        Button4.setFocusable(false);
        Button4.setBounds(30,240,350,50);
        Button4.setBackground(new Color(0xD2C6C6));
        Button4.setFont(new Font(null,Font.BOLD,20));
        Button4.setBorder(border);

        frame.add(Button1);
        frame.add(Button2);
        frame.add(Button3);
        frame.add(Button4);
        frame.setSize(425,360);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    }

