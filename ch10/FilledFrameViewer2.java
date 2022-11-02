package ch10;

import javax.swing.*;

public class FilledFrameViewer2 {
    public static void main(String[] args) {
        JFrame frame = new FilledFrame();
        frame.setTitle("Frame with two components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
