package ch10;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonFrame1 extends JFrame {
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public ButtonFrame1() {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        JButton button = new JButton("Click me!");
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);

        JPanel panel = new JPanel();
        panel.add(button);

        add(panel);
    }
}
