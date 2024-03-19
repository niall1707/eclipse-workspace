package week6_class;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Gui {

    public static void main(String[] args) {
        JFrame gui = new JFrame();
        
        // TITLE
        gui.setTitle("Submission Button"); // Corrected title and semicolon
        gui.setResizable(true);
        
        // Defining size of the window
        gui.setSize(300, 400);
        
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton button = new JButton("submit your work");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(gui, "You have submitted your work. Well done!"); // Corrected message
            }
        });
        
  
        panel.add(button);
        gui.add(panel);
        gui.setVisible(true);
    }
}

