package ch10;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChartComponent3 extends JComponent {
    private final ArrayList<Double> values;
    private final double maxValue;

    public ChartComponent3(double max) {
        values = new ArrayList<>();
        maxValue = max;
    }

    public void append(double value) {
        values.add(value);
        repaint();
    }

    public void paintComponent(Graphics g) {
        final int GAP = 5;
        final int BAR_HEIGHT = 10;

        int y = GAP;
        for (double value : values) {
            int barWidth = (int)(getWidth() * value / maxValue);
            g.fillRect(0, y, barWidth, BAR_HEIGHT);

            y += BAR_HEIGHT + GAP;
        }
    }
}
