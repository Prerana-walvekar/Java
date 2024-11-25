import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private double num1, num2, result;
    private String operator;

    public SimpleCalculator() {
        // Create the frame
        setTitle("Calculator");
        setSize(300, 400); // Smaller window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create display
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        // Create panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5)); // Compact grid layout with spacing

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Add buttons to panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18)); // Smaller font size
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Handle button clicks
        switch (command) {
            case "C":
                display.setText("");
                break;
            case "=":
                num2 = Double.parseDouble(display.getText());
                calculate();
                display.setText(String.valueOf(result));
                break;
            default:
                if (isOperator(command)) {
                    num1 = Double.parseDouble(display.getText());
                    operator = command;
                    display.setText("");
                } else {
                    display.setText(display.getText() + command);
                }
        }
    }

    private void calculate() {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    display.setText("Error");
                    return;
                }
                break;
        }
    }

    private boolean isOperator(String command) {
        return command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/");
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setVisible(true);
    }
}
