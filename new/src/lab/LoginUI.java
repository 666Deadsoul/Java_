package lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginUI extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel statusLabel;

    public LoginUI() {
        super("Login");
        setLayout(null);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(25,10,100,20);
        add(usernameLabel);

        usernameField = new JTextField(15);
        usernameField.setBounds(130,10,100,20);
        add(usernameField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(25,40,100,20);
        add(passwordLabel);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(130,40,100,20);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(50,70,80,20);
        add(loginButton);

        statusLabel = new JLabel("");
        statusLabel.setBounds(50, 90, 100, 20);
        add(statusLabel);

        loginButton.addActionListener(new LoginButtonListener());

        setSize(300, 300);
        setVisible(true);
    }

    private class LoginButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("password")) {
                statusLabel.setText("Login successful!");
            } else {
                statusLabel.setText("Invalid username or password");
            }
        }
    }

    public static void main(String[] args) {
        new LoginUI();
    }
}
