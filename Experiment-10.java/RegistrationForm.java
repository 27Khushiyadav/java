/*4) Write a Java Swing program to create a Registration Form that collects user details such as Name,
 Email, Password, and Confirm Password. Use a combination of JTextField for the name and email inputs, JPasswordField 
 for the password inputs, and a JButton labeled "Register". When the Register button is clicked, validate that none of 
 the fields are empty, that the Password and Confirm Password fields match, and that the email appears valid (for example, 
 containing an “@” symbol). Display a success message on the form if all validations pass; otherwise, show appropriate error 
 messages next to the respective fields. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {

    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JLabel nameError, emailError, passError, confirmPassError, successLabel;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("User Registration Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 3, 5, 5));

        // Components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        nameError = new JLabel("");
        nameError.setForeground(Color.RED);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        emailError = new JLabel("");
        emailError.setForeground(Color.RED);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        passError = new JLabel("");
        passError.setForeground(Color.RED);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        confirmPassError = new JLabel("");
        confirmPassError.setForeground(Color.RED);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        successLabel = new JLabel("");
        successLabel.setForeground(new Color(0, 128, 0));

        // Adding components to frame
        add(nameLabel); add(nameField); add(nameError);
        add(emailLabel); add(emailField); add(emailError);
        add(passwordLabel); add(passwordField); add(passError);
        add(confirmPasswordLabel); add(confirmPasswordField); add(confirmPassError);
        add(new JLabel("")); add(registerButton); add(successLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Reset error messages
        nameError.setText("");
        emailError.setText("");
        passError.setText("");
        confirmPassError.setText("");
        successLabel.setText("");

        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        boolean isValid = true;

        if (name.isEmpty()) {
            nameError.setText("Name required");
            isValid = false;
        }

        if (email.isEmpty()) {
            emailError.setText("Email required");
            isValid = false;
        } else if (!email.contains("@")) {
            emailError.setText("Invalid email");
            isValid = false;
        }

        if (password.isEmpty()) {
            passError.setText("Password required");
            isValid = false;
        }

        if (confirmPassword.isEmpty()) {
            confirmPassError.setText("Confirm password");
            isValid = false;
        } else if (!password.equals(confirmPassword)) {
            confirmPassError.setText("Passwords don't match");
            isValid = false;
        }

        if (isValid) {
            successLabel.setText("Registration successful!");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
