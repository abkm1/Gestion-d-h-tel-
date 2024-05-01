package View;

import Controller.ChambreClientController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ChambreClientView  {
    JButton button ;
    JTable table ;
    JScrollPane scrollPane ;
    JFrame frame;
    Border border ;

    ImageIcon imageIcon ;

    public JButton getButton() {
        return button;
    }

    public JFrame getFrame() {
        return frame;
    }

    public ChambreClientView ()
    {
        frame = new JFrame("Chambres");
        ImageIcon image = new ImageIcon("src/images/5-stars.png");
        frame.setIconImage(image.getImage());

        String[]Columns = {"Numéro de la chambre","Status"};
        String[][]data = {{"1","Réservée"},{"2","Réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}
                ,{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}
                ,{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"},{"3","Non réservée"}};//hado oumb3d ytbdlo pisk hard code

        table = new JTable(data,Columns);
        table.setBounds(80,80,100,100);

        border = BorderFactory.createLineBorder(new Color(0x857979),2);

        button = new JButton("Menu principal");
        button.setFocusable(false);
        button.setBounds(150,290,120,50);
        button.setBackground(new Color (0xD2C6C6));
        button.setForeground(new Color (0xf));
        button.setBorder(border);

        ChambreClientController controller = new ChambreClientController(this);
        button.addActionListener(controller);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(60,60,300,210);



        frame.add(button);
        frame.add(scrollPane);
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);//null bah nbedel lbounds kima n7ab
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
