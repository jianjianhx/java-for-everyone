package ch10;

import javax.swing.*;

public class FilledFrame extends JFrame {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;

    public FilledFrame() {
        createComponents();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("Hello world!");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);

        add(panel);
    }
}
