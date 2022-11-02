package ch10;

import javax.swing.*;

public class ButtonViewer2 {
    public static void main(String[] args) {
        JFrame frame = new ButtonFrame2();
        frame.setTitle("A Button Acting on Click");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
