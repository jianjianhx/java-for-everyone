package ch11;

import javax.swing.*;

/**
 * This program allows the user to view font effects.
 */
public class FontViewer {
    public static void main(String[] args) {
        JFrame frame = new FontFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Font Viewer");
        frame.setVisible(true);
    }
}
