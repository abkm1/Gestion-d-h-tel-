package View;

import Controller.SignUpController;
import Model.Client;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SignUpView {
    JFrame frame ;
    JButton button1 ;
    JButton button2 ;
    JTextField field1 ;
    JLabel label1;
    JTextField field2 ;
    JLabel label2;
    JTextField field3 ;
    JLabel label3;
    JTextField field4;
    JLabel label4;
    JTextField field5;
    JLabel label5;
    JLabel label6;

    public JFrame getFrame() {
        return frame;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JTextField getField1() {
        return field1;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JTextField getField2() {
        return field2;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JTextField getField3() {
        return field3;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public JTextField getField4() {
        return field4;
    }

    public JLabel getLabel4() {
        return label4;
    }

    public JTextField getField5() {
        return field5;
    }

    public JLabel getLabel5() {
        return label5;
    }


    public SignUpView ()
    {
        frame = new JFrame("Hotel Rahma");
        frame.setSize(350,260);
       Border border = BorderFactory.createLineBorder(new Color (0x857979),2);

        button1 = new JButton("S'inscrire");
        button1.setBounds(40,170,120,30);
        button1.setBackground(new Color(0xD2C6C6));
        button1.setForeground(new Color (0xf));
        button1.setFont(new Font(null,Font.BOLD,13));
        button1.setBorder(border);
        button1.setFocusable(false);


        button2 = new JButton("Annuler");
        button2.setBounds(170,170,120,30);
        button2.setBackground(new Color(0xD2C6C6));
        button2.setForeground(new Color (0xf));
        button2.setFont(new Font(null,Font.BOLD,13));
        button2.setBorder(border);
        button2.setFocusable(false);

        label1 = new JLabel("Nom:");
        label1.setBounds(10,10,100,25);
        field1 = new JTextField();
        field1.setBounds(45,10,100,25);
        label1.setFont(new Font (null,Font.BOLD,13));

        label2 = new JLabel("Prénom: ");
        label2.setBounds(10,40,100,25);
        field2 = new JTextField();
        field2.setBounds(70,40,100,25);
        label2.setFont(new Font (null,Font.BOLD,13));

        label3 = new JLabel("Code:");
        label3.setBounds(10,70,200,25);
        field3 = new JTextField();
        field3.setBounds(55,70,100,25);
        label3.setFont(new Font (null,Font.BOLD,13));

        label4 = new JLabel("Mot de passe:");
        label4.setBounds(10,100,100,25);
        field4 = new JTextField();
        field4.setBounds(100,100,100,25);
        label4.setFont(new Font (null,Font.BOLD,13));

        label5 = new JLabel("Nom d'utilisateur:");
        label5.setBounds(10,130,150,25);
        field5 = new JTextField();
        field5.setBounds(125,130,100,25);
        label5.setFont(new Font (null,Font.BOLD,13));

        label6 = new JLabel("( Pour les admins )");
        label6.setBounds(160,70,150,25);
        label6.setFont(new Font (null,Font.BOLD,13));




        SignUpController controller = new SignUpController(this);
        button1.addActionListener(controller);
        button2.addActionListener(controller);

        frame.add(label1);
        frame.add(field1);
        frame.add(label2);
        frame.add(field2);
        frame.add(label3);
        frame.add(field3);
        frame.add(label4);
        frame.add(field4);
        frame.add(label5);
        frame.add(field5);
        frame.add(label6);
        frame.add(button1);
        frame.add(button2);

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
