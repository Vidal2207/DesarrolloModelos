import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?"); 
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize (300,300);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener{
        public void actionPerformed (ActionEvent event) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            System.out.println("Come on, do it!");
        }
    }
}









// public void actionPerformed (ActionEvent event) { System.out.println("Come on, do it?");

// 16

// JButton button new JButton("hould I do 157");

// button.addActionListener(new AngelListener()); button.addActionListener(new DevilListener()); trane.getContentPane().add(BorderLayout.CENTER, button)?

// // Jax trane properties

// frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE):

// trane.getContentPane().add(BorderLayout.CENTER, button)}

// frame.setSize(300,300)

// frame.setVisible(true);

// Should I do it?

// 34

// class AngelListener implements ActionListener

// public void actionPerformed (ActionEvent event) {

// System.out.println("Don't do it, you might regret it!"

// class DevilListener implements ActionListener (

// public void actionPerformed (ActionEvent event) {

// System.out.println("Come on, st.!");