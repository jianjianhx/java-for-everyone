package ch11;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * This frame contains a moving rectangle.
 */
public class RectangleFrame2 extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private final RectangleComponent2 scene;

    class MousePressListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            scene.moveRectangleTo(x, y);
        }

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public RectangleFrame2() {
        scene = new RectangleComponent2();
        scene.addMouseListener(new MousePressListener());
        add(scene);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
