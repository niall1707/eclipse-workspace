package week6_class;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutExample extends JFrame {
    private JButton[] buttons;

    public GridLayoutExample() {
        setTitle("Grid of Buttons");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create buttons
        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].addActionListener(new ButtonClickListener());
            add(buttons[i]);
        }

        // Set GridLayout
        setLayout(new GridLayout(3, 3));
    }

    private boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            int num = Integer.parseInt(source.getText());

            String message = num % 2 == 0 ? "Even" : "Odd";
            if (isPrime(num)) {
                message = "Prime and " + message;
            }
            showMessage(message + " number: " + num);
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GridLayoutExample().setVisible(true);
            }
        });
    }
}
