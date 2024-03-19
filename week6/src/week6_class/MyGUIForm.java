package week6_class;


import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIForm extends JFrame {
    private JButton button1;
    private JButton button2;
    private JLabel messageLabel;

    public MyGUIForm() {
        setTitle("GUI Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create components
        button1 = new JButton("Click me 1");
        button2 = new JButton("Click me 2");
        messageLabel = new JLabel("Message will appear here");

        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessage("Button 1 clicked!");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessage("Button 2 clicked!");
            }
        });

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(button1);
        add(button2);
        add(messageLabel);
    }

    private void showMessage(String message) {
        messageLabel.setText(message);
    }

    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyGUIForm().setVisible(true);
            }
        });
    }
}
