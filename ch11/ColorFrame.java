package ch11;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private final JPanel colorPanel;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;

    public ColorFrame() {
        colorPanel = new JPanel();

        add(colorPanel, BorderLayout.CENTER);
        createControlPanel();
        setSampleColor();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    class ColorListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            setSampleColor();
        }
    }

    public void createControlPanel() {
        ChangeListener listener = new ColorListener();

        redSlider = new JSlider(0, 255, 255);
        redSlider.addChangeListener(listener);

        greenSlider = new JSlider(0, 255, 175);
        greenSlider.addChangeListener(listener);

        blueSlider = new JSlider(0, 255, 175);
        blueSlider.addChangeListener(listener);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 2));

        controlPanel.add(new JLabel("Red"));
        controlPanel.add(redSlider);

        controlPanel.add(new JLabel("Green"));
        controlPanel.add(greenSlider);

        controlPanel.add(new JLabel("Blue"));
        controlPanel.add(blueSlider);

        add(controlPanel, BorderLayout.SOUTH);
    }

    /**
     * Reads the slider values and sets the panel to the selected color.
     */
    public void setSampleColor() {
        // Read slider values
        int red = redSlider.getValue();
        int green = greenSlider.getValue();
        int blue = blueSlider.getValue();

        // Set panel background to selected color
        colorPanel.setBackground(new Color(red, green, blue));
    }
}
