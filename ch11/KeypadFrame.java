package ch11;

import javax.swing.*;
import java.awt.*;

public class KeypadFrame extends JFrame {
    private static final int BUTTON_ROWS = 4;
    private static final int BUTTON_COLS = 3;

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private static final String[] DEFAULT_BUTTONS
            = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "CE"};

    private JButton[] buttons;
    private JTextField display;
    private JPanel buttonPanel;
    private JPanel mainPanel;

    public KeypadFrame() {
        createDisplay();
        createButtons();
        createButtonPanel();
        createMainPanel();
        add(mainPanel);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createDisplay() {
        display = new JTextField();
    }

    private void createButtons() {
        buttons = new JButton[DEFAULT_BUTTONS.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(KeypadFrame.DEFAULT_BUTTONS[i]);
        }
    }

    private void createButtonPanel() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(BUTTON_ROWS, BUTTON_COLS));
        for (var button : buttons) {
            buttonPanel.add(button);
        }
    }

    private void createMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(display, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
    }
}
