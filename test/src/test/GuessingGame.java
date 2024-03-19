package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GuessingGame extends JFrame {

    private JButton generateButton;
    private JTextField guessField;
    private JLabel resultLabel;
    private int randomNumber;
    private int guessCount;

    public GuessingGame() {
        setTitle("Guessing Game");
        setSize(400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        generateButton = new JButton("Generate the random number");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomNumber();
            }
        });
        panel.add(generateButton);

        JLabel guessTextLabel = new JLabel("Make a guess:");
        guessField = new JTextField(10);

        resultLabel = new JLabel("");
        panel.add(guessTextLabel);
        panel.add(guessField);
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    private void generateRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(101); // Generates random number between 0 and 100
        guessCount = 0;
        resultLabel.setText("Enter your guess:");
    }

    private void checkGuess() {
        if (randomNumber == 0) {
            JOptionPane.showMessageDialog(this, "Generate a random number first!");
            return;
        }

        try {
            if (guessField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a guess.");
                return;
            }

            int guess = Integer.parseInt(guessField.getText());
            guessCount++;

            if (guess == randomNumber) {
                resultLabel.setText("Correct. It took you " + guessCount + " guesses.");
                randomNumber = 0; // Reset for the next game
            } else if (guess < randomNumber) {
                resultLabel.setText("Too low. Guess again.");
            } else {
                resultLabel.setText("Too high. Guess again.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new GuessingGame();
    }
}