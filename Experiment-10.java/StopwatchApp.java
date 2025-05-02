/*5)  Write a Java Swing program to implement a simple Stopwatch. The GUI should include a JLabel to 
display the elapsed time (in seconds) and three JButtons labeled "Start", "Stop", and "Reset". Use a Swing Timer
 to update the JLabel every second while the stopwatch is running. The "Start" button should begin timing, the "Stop" button
  should pause the timer, and the "Reset" button should set the elapsed time back to zero. Ensure that the GUI updates correctly
   based on the user’s interactions.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchApp extends JFrame implements ActionListener {

    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedSeconds = 0;
    private boolean isRunning = false;

    public StopwatchApp() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center window
        setLayout(new BorderLayout(10, 10));

        // Time display
        timeLabel = new JLabel("Elapsed Time: 0 sec", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(timeLabel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Timer setup
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elapsedSeconds++;
                updateTimeLabel();
            }
        });

        setVisible(true);
    }

    // Update label text
    private void updateTimeLabel() {
        timeLabel.setText("Elapsed Time: " + elapsedSeconds + " sec");
    }

    // Handle button actions
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!isRunning) {
                timer.start();
                isRunning = true;
            }
        } else if (e.getSource() == stopButton) {
            if (isRunning) {
                timer.stop();
                isRunning = false;
            }
        } else if (e.getSource() == resetButton) {
            timer.stop();
            elapsedSeconds = 0;
            isRunning = false;
            updateTimeLabel();
        }
    }

    public static void main(String[] args) {
        new StopwatchApp();
    }
}

