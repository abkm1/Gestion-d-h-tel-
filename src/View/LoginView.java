package View ;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginView implements ActionListener {

    JFrame frame = new JFrame();
    Border border = BorderFactory.createLineBorder(new Color(0xf),1);
    JButton loginButton = new JButton("Se connecter");
    JButton resetButton = new JButton("Réinitialiser");

    JTextField usernameField = new JTextField() ;

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    JPasswordField userPasswordField = new JPasswordField();

    JLabel username = new JLabel ("Nom d'utilisateur :");
    JLabel userPassword = new JLabel ("Mot de passe :");


    HashMap<String,String> LoginInfo = new HashMap <String,String>();
    public LoginView(HashMap<String, String> LoginInfoOriginal) {
        LoginInfo = LoginInfoOriginal ;

        ImageIcon icon = new ImageIcon("images/5-stars.png");

        username.setBounds(50,100,110,25);
        usernameField.setBounds(155,100,200,25);
        userPassword.setBounds(70,150,90,25);
        userPasswordField.setBounds(155,148,200,25);


        loginButton.setBounds(80,200,125,25);
        loginButton.setBorder(border);
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.BLACK);
        loginButton.setBackground(new Color(0xC4C2C2));
        loginButton.addActionListener(this);

        resetButton.setBounds(215,200,125,25);
        resetButton.setFocusable(false);
        resetButton.setBorder(border);
        resetButton.setForeground(Color.BLACK);
        resetButton.setBackground(new Color (0xC4C2C2));
        resetButton.addActionListener(this);

        frame.setIconImage(icon.getImage());
        frame.setTitle("Hotel Rahma ");
        frame.add(username);
        frame.add(userPassword);
        frame.add(usernameField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton)
        {
            usernameField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource()==loginButton)
        {
            String username = usernameField.getText();
            String password = String.valueOf(userPasswordField.getPassword());


          if(LoginInfo.containsKey(username) && (LoginInfo.get(username).equals(password)))
          {
                   usernameField.setForeground(Color.GRAY);
                   userPasswordField.setForeground(Color.GRAY);
                   new PageAccueilAdminView();
                   frame.dispose();
          }
          else
          {
             JOptionPane.showMessageDialog(null,"Oops, un problème d'authentification","Erreur",JOptionPane.ERROR_MESSAGE);
              usernameField.setText("");
              userPasswordField.setText("");
          }
        }

    }
}
