package week6_class;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.WindowConstants;



public class Task1 {

   public static void main(String[] args) {

       JFrame gui = new JFrame();

       //name of title of gui 
       gui.setTitle("My First GUI");
       //can the user changethe size of the window
       gui.setResizable(false);
       //og size of the window 
       gui.setSize(400, 500);

       gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




       JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));




       JButton button1 = new JButton("CLICK ME");

       button1.addActionListener(new ActionListener() {

           @Override

           public void actionPerformed(ActionEvent e) {

               JOptionPane.showMessageDialog(gui, "Button 1 Clicked");

           }

       });




       JButton button2 = new JButton("CLICK ME");

       button2.addActionListener(new ActionListener() {

           @Override

           public void actionPerformed(ActionEvent e) {

               JOptionPane.showMessageDialog(gui, "Button 2 Clicked");

           }

       });




       panel.add(button1);

       panel.add(button2);




       gui.add(panel);

       gui.setVisible(true);

   }

}