package Controller;

import Model.*;
import View.PageAccueilClientView;
import View.ReservationClientView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ReservationClientController implements ActionListener {
    ReservationClientView view ;
    Client client = (Client) Hotel.getUtilisateurs().get(CurrentClient.username);

    public ReservationClientController(ReservationClientView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getButton1())
        {
         view.getFrame2().setVisible(true);
        }

        if (e.getSource() == view.getButton2()) {
            view.getFrame4().setVisible(true);
        }


        if (e.getSource() == view.getButton3())
        {

            try{
                int num = Integer.parseInt(view.getTextField11().getText());

                client.annulation(Hotel.getReservations().get(num));


                Map<Integer, Reservation> map = Hotel.getReservations();
                Map<Integer, Reservation> sortedMap = new TreeMap<>(map);


                view.getModel2().setRowCount(0);
                for (Map.Entry<Integer, Reservation> entry : sortedMap.entrySet()) {
                    if(entry.getValue().getClient().getUsername().equals(CurrentClient.username)) {
                        view.getModel2().addRow(new Object[]{entry.getKey(),entry.getValue().getChambre().getNumChambre(), entry.getValue().getDate_debut().toString(),entry.getValue().getDate_fin().toString(),entry.getValue().getEtat()});
                    }
                }

                view.getTextField11().setText("");


            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Remplicez le champs correctement !");
            }

        }
        if (e.getSource()==view.getButton4())
        {
            view.getFrame1().dispose();
            new PageAccueilClientView();
        }
        if (e.getSource()==view.getButton5())
        {

            try {
                if (view.getTextField1().getText().isEmpty() || view.getTextField2().getText().isEmpty() || view.getTextField3().getText().isEmpty() || view.getTextField7().getText().isEmpty() || view.getTextField8().getText().isEmpty() || view.getTextField9().getText().isEmpty() || view.getTextField10().getText().isEmpty()) {
                    throw new Exception("Veuillez remplir tous les champs !");
                }
                try {


                int num = Integer.parseInt(view.getTextField1().getText());
                int j1 = Integer.parseInt(view.getTextField2().getText());
                int j2 = Integer.parseInt(view.getTextField3().getText());
                int m1 = Integer.parseInt(view.getTextField7().getText());
                int a1 = Integer.parseInt(view.getTextField8().getText());
                int m2 = Integer.parseInt(view.getTextField9().getText());
                int a2 = Integer.parseInt(view.getTextField10().getText());

                if (num <= 0 || m2 <= 0 || m1 <= 0 || j2 <= 0 || j1 <= 0 || a1 <= 0 || a2 <= 0 ) {
                    JOptionPane.showMessageDialog(null, "Num(s) invalide(s)", "Error", JOptionPane.ERROR_MESSAGE);
                }

                    LaDate debut = new LaDate(j1,m1,a1);
                    LaDate fin = new LaDate(j2,m2,a2);

                    try {
                        if(!(debut.estAvant(fin) && debut.estApres(LaDate.aujourdhui()))){throw new Exception("les Dates choisies sont inutilisables "); }

                        if(test(num,client,debut,fin)){

                            JOptionPane.showMessageDialog(null,"Cette reservation existe Deja !");

                        }
                        else {
                            client.demand(num, debut, fin);
                        }

                      //  System.out.println(Hotel.getReservations().toString());
                        view.getTextField1().setText("");
                        view.getTextField2().setText("");
                        view.getTextField3().setText("");
                        view.getTextField4().setText("");
                        view.getTextField5().setText("");
                        view.getTextField6().setText("");
                        view.getTextField7().setText("");
                        view.getTextField8().setText("");
                        view.getTextField9().setText("");
                        view.getTextField10().setText("");



                    }catch (Exception b){
                        JOptionPane.showMessageDialog(null, b.getMessage());
                    }




             } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "N'utilisez pas de lettres !", "Error", JOptionPane.ERROR_MESSAGE);

             }


            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, a.getMessage());

            }


        }
        if (e.getSource()==view.getButton6())
        {
            view.getFrame2().dispose();
        }
        if(e.getSource()==view.getButton7())
        {
            view.getFrame3().setVisible(true);

            Map<Integer, Reservation> map = Hotel.getReservations();
            Map<Integer, Reservation> sortedMap = new TreeMap<>(map);


            view.getModel2().setRowCount(0);
            for (Map.Entry<Integer, Reservation> entry : sortedMap.entrySet()) {
                if(entry.getValue().getClient().getUsername().equals(CurrentClient.username)) {
                    view.getModel2().addRow(new Object[]{entry.getKey(),entry.getValue().getChambre().getNumChambre(), entry.getValue().getDate_debut().toString(),entry.getValue().getDate_fin().toString(),entry.getValue().getEtat()});
                }
            }
        }
        if(e.getSource()==view.getButton8())
        {
            try {
                int num = Integer.parseInt(view.getTextField4().getText());
                int j1 = Integer.parseInt(view.getTextField5().getText());
                int j2 = Integer.parseInt(view.getTextField6().getText());
                int m1 = Integer.parseInt(view.getTextField12().getText());
                int a1 = Integer.parseInt(view.getTextField13().getText());
                int m2 = Integer.parseInt(view.getTextField14().getText());
                int a2 = Integer.parseInt(view.getTextField15().getText());

                if (num <= 0 || m2 <= 0 || m1 <= 0 || j2 <= 0 || j1 <= 0 || a1 <= 0 || a2 <= 0 ) {
                    JOptionPane.showMessageDialog(null, "Num(s) invalide(s)", "Error", JOptionPane.ERROR_MESSAGE);
                }

                LaDate debut = new LaDate(j1,m1,a1);
                LaDate fin = new LaDate(j2,m2,a2);


                if (!Hotel.getReservations().containsKey(num) ) throw new Exception("Cette reservation n'existe pas dans votre liste !");

                if( debut.estAvant(LaDate.aujourdhui()) || (debut.estApres(Hotel.getReservations().get(num).getDate_debut()) &&  Hotel.getReservations().get(num).getDate_debut().estAvant(LaDate.aujourdhui()))|| fin.estAvant(LaDate.aujourdhui()) || debut.estApres(fin) )
                {
                    JOptionPane.showMessageDialog(null, "les Dates choisies sont inutilisables", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    Hotel.getReservations().get(num).setDate_debut(debut);
                    Hotel.getReservations().get(num).setDate_fin(fin);
                }


                view.getTextField4().setText("");
                view.getTextField5().setText("");
                view.getTextField6().setText("");
                view.getTextField12().setText("");
                view.getTextField13().setText("");
                view.getTextField14().setText("");
                view.getTextField15().setText("");





            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Remplicez le champs correctement !");
            }
            catch (Exception a){JOptionPane.showMessageDialog(null,a.getMessage());}
        }
        if(e.getSource()==view.getButton9())
        {
            view.getFrame4().dispose();
        }
        if(e.getSource()==view.getButton10())
        {
            System.out.println(Hotel.getReservations().toString());

            Map<Integer, Reservation> map = Hotel.getReservations();
            Map<Integer, Reservation> sortedMap = new TreeMap<>(map);

            System.out.println(sortedMap);

            view.getModel2().setRowCount(0);
            for (Map.Entry<Integer, Reservation> entry : sortedMap.entrySet()) {
                if(entry.getValue().getClient().getUsername().equals(CurrentClient.username)) {
                    view.getModel2().addRow(new Object[]{entry.getKey(),entry.getValue().getChambre().getNumChambre(), entry.getValue().getDate_debut().toString(),entry.getValue().getDate_fin().toString(),entry.getValue().getEtat()});
                }
            }

        }

    }


    public boolean test(int chambre, Client client, LaDate debut, LaDate fin ){
        Map<Integer, Reservation> map = Hotel.getReservations();
        Map<Integer, Reservation> sortedMap = new TreeMap<>(map);


        for (Map.Entry<Integer, Reservation> entry : sortedMap.entrySet()) {

             if ((entry.getValue().getChambre().getNumChambre() == chambre) &&
                     ( entry.getValue().getClient().getUsername().equals(client.getUsername())) &&
                     ( entry.getValue().getDate_debut().estEgale(debut)) &&
                     (entry.getValue().getDate_fin().estEgale(fin)) ){ return true;}


        }

        return false;
    }
}
