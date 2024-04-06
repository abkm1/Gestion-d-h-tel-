package View ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginView implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Se connecter");
    JButton resetButton = new JButton("Réinitialiser");

    JTextField usernameField = new JTextField() ;


    JPasswordField userPasswordField = new JPasswordField();

    JLabel username = new JLabel ("Nom d'utilisateur :");
    JLabel userPassword = new JLabel ("Mot de passe :");

    JLabel Return = new JLabel();

    HashMap<String,String> LoginInfo = new HashMap <String,String>();
    public LoginView(HashMap<String, String> LoginInfoOriginal) {
        LoginInfo = LoginInfoOriginal ;

        ImageIcon icon = new ImageIcon("images/5-stars.png");

        username.setBounds(50,100,110,25);
        usernameField.setBounds(155,100,200,25);
        userPassword.setBounds(70,150,90,25);
        userPasswordField.setBounds(155,148,200,25);

        Return.setBounds(100,125,250,250);

        loginButton.setBounds(80,200,125,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(215,200,125,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.setIconImage(icon.getImage());
        frame.setTitle("Hotel Rahma ");
        frame.add(username);
        frame.add(userPassword);
        frame.add(usernameField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(Return);
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
                   Return.setFont(new Font(null,Font.BOLD,11));
                   Return.setText("");
                   PageAccueilAdminView Accueil = new PageAccueilAdminView();
          }
          else
          {
              Return.setForeground(Color.red);
              Return.setFont(new Font(null,Font.BOLD,11));
              Return.setText("Oops, un problème d'authentification.");
              usernameField.setText("");
              userPasswordField.setText("");
          }
        }

    }
}
