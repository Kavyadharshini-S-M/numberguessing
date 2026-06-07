// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main {

    private static int numberToGuess;

    public static void main(String[] args) {

        Random r = new Random();
        numberToGuess = r.nextInt(100) + 1;

        JFrame frame = new JFrame("Guess The Number");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel title = new JLabel("Guess a number between 1 and 100");

        JTextField guessField = new JTextField(10);

        JButton guessButton = new JButton("Guess");

        JLabel resultLabel = new JLabel("Enter your guess!");

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int guess = Integer.parseInt(guessField.getText());

                    if (guess == numberToGuess) {
                        resultLabel.setText("🎉 Correct! You guessed it!");
                    }
                    else if (guess < numberToGuess) {
                        resultLabel.setText("Think a bit higher...");
                    }
                    else {
                        resultLabel.setText("Too big! Try smaller.");
                    }

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });

        frame.add(title);
        frame.add(guessField);
        frame.add(guessButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}