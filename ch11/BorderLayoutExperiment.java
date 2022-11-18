package ch11;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExperiment {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        JTextField firstTextField = new JTextField("This is the first text field.");
        JTextField secondTextField = new JTextField("This is the second text field.");
        frame.add(firstTextField, BorderLayout.NORTH);
        frame.add(secondTextField, BorderLayout.NORTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
