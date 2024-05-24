package View;
import Controller.ChambreAdminController;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class ChambreAdminView {
    JFrame frame ;
    JFrame frame2;
    JButton button1 ;
    JButton button2 ;
    JButton button3 ;
    JButton refresh ;

    public JButton getRefresh() {
        return refresh;
    }

    JButton button4;

    public JFrame getFrame() {
        return frame;
    }

    public JButton getButton4() {
        return button4;
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

    public void setButton4(JButton button4) {
        this.button4 = button4;
    }

    Border border;

    JTable chambres;
    JTextField field ;
    JLabel label ;

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public JTable getChambres() {
        return chambres;
    }

    public void setChambres(JTable chambres) {
        this.chambres = chambres;
    }

    public JTextField getField() {
        return field;
    }

    public void setField(JTextField field) {
        this.field = field;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JFrame getFrame2() {
        return frame2;
    }

    public void setFrame2(JFrame frame2) {
        this.frame2 = frame2;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    DefaultTableModel model ;


    public DefaultTableModel getModel() {
        return model;
    }



    public JButton getButton6() {
        return button6;
    }

    JScrollPane scrollPane ;
    JButton button5;
    JButton button6;

    JButton button7;
    JButton button8;

    JLabel labelx ;
    JLabel labely ;


    JTextField fieldx ;
    JTextField  fieldy ;

    JButton button9;
    JButton button10;


    public JButton getButton9() {
        return button9;
    }

    public JButton getButton10() {
        return button10;
    }

    public JButton getButton7() {
        return button7;
    }

    public JButton getButton8() {
        return button8;
    }

    JFrame frame3 ;

    public JFrame getFrame3() {
        return frame3;
    }


    JTextField field2;
    JLabel label2;

    public JTextField getField2() {
        return field2;
    }


    public JButton getButton5() {
        return button5;
    }

    public ChambreAdminView()
    {
     frame = new JFrame("Chambres");

     ImageIcon image = new ImageIcon("src/images/5-stars.png");
     frame.setIconImage(image.getImage());


     model = new DefaultTableModel(new Object[]{"Numéro de la chambre ","Status"},0);



     chambres = new JTable(model);

     chambres.setBounds(80,80,100,100);

     scrollPane = new JScrollPane(chambres);
     scrollPane.setBounds(60,60,300,210);

      border = BorderFactory.createLineBorder(new Color(0x857979),2);

     button1 = new JButton ("Ajouter");
        button1.setFocusable(false);
        button1.setBounds(60,275,90,50);
        button1.setBackground(new Color (0xD2C6C6));
        button1.setForeground(new Color (0xf));
        button1.setBorder(border);
     button2 = new JButton ("Modifier");
        button2.setFocusable(false);
        button2.setBounds(160,275,90,50);
        button2.setBackground(new Color (0xD2C6C6));
        button2.setForeground(new Color (0xf));
        button2.setBorder(border);
     button3 = new JButton("Supprimer");
        button3.setFocusable(false);
        button3.setBounds(260,275,100,50);
        button3.setBackground(new Color (0xD2C6C6));
        button3.setForeground(new Color (0xf));
        button3.setBorder(border);
     button4 = new JButton("Menu Principal");
        button4.setFocusable(false);
        button4.setBounds(150,330,120,50);
        button4.setBackground(new Color (0xD2C6C6));
        button4.setForeground(new Color (0xf));
        button4.setBorder(border);

        refresh = new JButton("\uD83D\uDD01");
        refresh.setBorder(border);
        refresh.setBounds(320,30,40,25);
        refresh.setBackground(new Color (0xD2C6C6));
        refresh.setForeground(new Color (0xf));
        refresh.setFocusable(false);
        frame.add(refresh);




        ChambreAdminController controller = new ChambreAdminController(this);

        button1.addActionListener(controller);
        button2.addActionListener(controller);
        button3.addActionListener(controller);
        button4.addActionListener(controller);




        frame2 = new JFrame("Ajouter Chambre");
        field = new JTextField();
        field.setBounds(180,38,100,25);
        label = new JLabel("Numéro de la chambre :");
        label.setBounds(20,0,200,100);
        label.setFont(new Font (null,Font.BOLD,13));

        button5 = new JButton("OK");
        button5.setFocusable(false);
        button5.setBounds(100,80,90,30);
        button5.setBackground(new Color (0xD2C6C6));
        button5.setForeground(new Color (0xf));
        button5.setBorder(border);

        button6 = new JButton("Annuler");
        button6.setFocusable(false);
        button6.setBounds(200,80,100,30);
        button6.setBackground(new Color (0xD2C6C6));
        button6.setForeground(new Color (0xf));
        button6.setBorder(border);



        button5.addActionListener(controller);
        button6.addActionListener(controller);



        frame2.add(label);
        frame2.add(field);
        frame2.add(button5);
        frame2.add(button6);
        frame2.setVisible(false);
        frame2.setSize(400,170);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.setLayout(null);


        frame3 = new JFrame("Supprimer Chambre");
        field2 = new JTextField();
        field2.setBounds(180,38,100,25);
        label2 = new JLabel("Numéro de la chambre :");
        label2.setBounds(20,0,200,100);
        label2.setFont(new Font (null,Font.BOLD,13));

        button7 = new JButton("OK");
        button7.setFocusable(false);
        button7.setBounds(100,80,90,30);
        button7.setBackground(new Color (0xD2C6C6));
        button7.setForeground(new Color (0xf));
        button7.setBorder(border);

        button8 = new JButton("Annuler");
        button8.setFocusable(false);
        button8.setBounds(200,80,100,30);
        button8.setBackground(new Color (0xD2C6C6));
        button8.setForeground(new Color (0xf));
        button8.setBorder(border);


        button7.addActionListener(controller);
        button8.addActionListener(controller);
        refresh.addActionListener(controller);

        frame3.add(label2);
        frame3.add(field2);
        frame3.add(button7);
        frame3.add(button8);
        frame3.setVisible(false);
        frame3.setSize(400,170);
        frame3.setResizable(false);
        frame3.setLocationRelativeTo(null);
        frame3.setLayout(null);



     frame.add(button1);
     frame.add(button2);
     frame.add(button3);
     frame.add(button4);
     frame.add(scrollPane);
     frame.setSize(450,450);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLayout(null);    //null bah nbedel lbounds kima n7ab
     frame.setLocationRelativeTo(null);
     frame.setVisible(true);


    }



}
