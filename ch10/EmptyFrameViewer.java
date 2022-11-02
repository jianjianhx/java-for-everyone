package ch10;

import javax.swing.*;

public class EmptyFrameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 300;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("An Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
