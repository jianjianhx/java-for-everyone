package ch11;

import javax.swing.*;
import java.awt.*;

/**
 * This component displays a rectangle that can be moved.
 */
public class RectangleComponent extends JComponent {
    private static final int RECTANGLE_WIDTH = 20;
    private static final int RECTANGLE_HEIGHT = 30;

    private int xLeft;
    private int yTop;

    public RectangleComponent() {
        xLeft = 0;
        yTop = 0;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.fillRect(xLeft, yTop, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
    }

    /**
     * Moves the rectangle by a given amount.
     * @param dx the amount to move in the x-direction
     * @param dy the amount to move in the y-direction
     */
    public void moveRectangleBy(int dx, int dy) {
        xLeft += dx;
        yTop += dy;
        repaint();
    }
}
