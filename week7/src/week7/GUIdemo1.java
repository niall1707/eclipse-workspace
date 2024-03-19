package week7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIdemo1 {
    private JFrame frame;
    private JTextField input;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private int width;
    private int height;
    
    public GUIdemo1(int w, int h) {
        frame = new JFrame();
        label = new JLabel("hello");
        input = new JTextField(10);
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        width = w;
        height = h;
    }
    
    public void setUpGUI() {
        Container pane = frame.getContentPane();
        FlowLayout flow = new FlowLayout();
        pane.setLayout(flow);
        frame.setSize(width, height);
        frame.setTitle("GUI Demo");
        pane.add(input);
        pane.add(label);
        pane.add(button1);
        pane.add(button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void setUpButtonListeners() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Object o = ae.getSource();
                if (o == button1) {
                	String s = input.getText();
                	label.setText(s);
                	input.setText("");
                  
                } else if (o == button2) {
                    System.out.println("Welcome!");
                }
            }
        };

//        public void setUpButtonListeners() {
//            ActionListener buttonListener = new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent ae) {
//                    System.out.println("Click me!");
//                }
//            };
//            
//            ActionListener buttonListener2 = new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent ae) {
//                    System.out.println("Welcome!");
//                }
//            };
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
    }
}
