package View ;

import Controller.LoginController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginView  {

    JFrame frame = new JFrame("Hotel Rahma");

    public HashMap<String, String> getLoginInfo() {
        return LoginInfo;
    }

    public JFrame getFrame() {
        return frame;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getUserPasswordField() {
        return userPasswordField;
    }

    public JLabel getUsername() {
        return username;
    }

    public JLabel getUserPassword() {
        return userPassword;
    }

    Border border = BorderFactory.createLineBorder(new Color(0xf),1);
    JButton loginButton = new JButton("Se connecter");
    JButton SignupButton = new JButton("Créer compte");

    JTextField usernameField = new JTextField() ;

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getResetButton() {
        return SignupButton;
    }

    JPasswordField userPasswordField = new JPasswordField();

    JLabel username = new JLabel ("Nom d'utilisateur :");
    JLabel userPassword = new JLabel ("Mot de passe :");


    HashMap<String,String> LoginInfo = new HashMap <String,String>();
    public LoginView(HashMap<String, String> LoginInfoOriginal) {
        LoginInfo = LoginInfoOriginal ;

        ImageIcon icon = new ImageIcon("src/images/5-stars.png");

        username.setBounds(50,100,110,25);
        usernameField.setBounds(155,100,200,25);
        userPassword.setBounds(70,150,90,25);
        userPasswordField.setBounds(155,148,200,25);


        loginButton.setBounds(80,200,125,25);
        loginButton.setBorder(border);
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.BLACK);
        loginButton.setBackground(new Color(0xC4C2C2));


        SignupButton.setBounds(215,200,125,25);
        SignupButton.setFocusable(false);
        SignupButton.setBorder(border);
        SignupButton.setForeground(Color.BLACK);
        SignupButton.setBackground(new Color (0xC4C2C2));


        LoginController controller = new LoginController(this);
        loginButton.addActionListener(controller);
        SignupButton.addActionListener(controller);

        frame.setIconImage(icon.getImage());
        frame.add(username);
        frame.add(userPassword);
        frame.add(usernameField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(SignupButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


}
