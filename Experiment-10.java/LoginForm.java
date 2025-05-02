/*1) 1.Write a Java Swing program to create a Login Form using JTextField, JPasswordField, JButton, and JLabel.
 When the login button is clicked, validate if the username is "admin" and the password is "password".*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    // Components
    private JLabel userLabel, passLabel, messageLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public LoginForm() {
        // Frame settings
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the frame
        setLayout(new GridLayout(4, 2, 10, 10));

        // Create components
        userLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");
        messageLabel = new JLabel("");
        userField = new JTextField();
        passField = new JPasswordField();
        loginButton = new JButton("Login");

        // Add action listener to the button
        loginButton.addActionListener(this);

        // Add components to the frame
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(new JLabel("")); // empty cell
        add(loginButton);
        add(messageLabel);

        // Make frame visible
        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        if (username.equals("admin") && password.equals("password")) {
            messageLabel.setText("Login successful!");
            messageLabel.setForeground(Color.GREEN);
        } else {
            messageLabel.setText("Invalid username or password.");
            messageLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}


