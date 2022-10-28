package ch10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame2 extends JFrame {
    private JLabel label;

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;

    class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("I was clicked.");
        }
    }

    public ButtonFrame2() {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        JButton button = new JButton("Click me!");
        button.addActionListener(new ClickListener());
        label = new JLabel("Hello, World!");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);

        add(panel);
    }
}
