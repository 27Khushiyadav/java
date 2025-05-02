/*2) Design a simple calculator using Java Swing with buttons for digits (0-9), addition (+), subtraction (-),
 multiplication (*), and division (/). Implement event handling for button clicks and display the result in a JTextField.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    private JTextField textField;
    private String current = "";
    private double result = 0;
    private String operator = "";

    public SimpleCalculator() {
        // Frame settings
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Display field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        add(textField, BorderLayout.NORTH);

        // Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String b : buttons) {
            JButton button = new JButton(b);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    // Button click handling
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.matches("[0-9]")) {
            current += input;
            textField.setText(current);
        } else if (input.matches("[+\\-*/]")) {
            if (!current.isEmpty()) {
                result = Double.parseDouble(current);
                operator = input;
                current = "";
                textField.setText("");
            }
        } else if (input.equals("=")) {
            if (!current.isEmpty() && !operator.isEmpty()) {
                double secondOperand = Double.parseDouble(current);
                switch (operator) {
                    case "+": result += secondOperand; break;
                    case "-": result -= secondOperand; break;
                    case "*": result *= secondOperand; break;
                    case "/":
                        if (secondOperand == 0) {
                            textField.setText("Error: Divide by 0");
                            current = "";
                            return;
                        }
                        result /= secondOperand; break;
                }
                textField.setText(String.valueOf(result));
                current = String.valueOf(result);
                operator = "";
            }
        } else if (input.equals("C")) {
            current = "";
            result = 0;
            operator = "";
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}

    

