package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This frame has a menu with commands to change the font
 * of a text sample
 */
public class FontFrame2 extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private final JLabel label;
    private String faceName;
    private int fontStyle;
    private int fontSize;

    /**
     * Constructs the frame.
     */
    public FontFrame2() {
        // Construct text sample
        label = new JLabel("Big Java");
        add(label, BorderLayout.CENTER);

        // Construct menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(createFileMenu());
        menuBar.add(createFontMenu());

        faceName = "Serif";
        fontSize = 24;
        fontStyle = Font.PLAIN;

        setLabelFont();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    static class ExitItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    /**
     * Creates the File menu.
     * @return the menu
     */
    public JMenu createFileMenu() {
        JMenu menu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ExitItemListener());
        menu.add(exitItem);
        return menu;
    }

    /**
     * Creates the Font submenu.
     * @return the menu
     */
    public JMenu createFontMenu() {
        JMenu menu = new JMenu("Font");
        menu.add(createFaceMenu());
        menu.add(createSizeMenu());
        menu.add(createStyleMenu());
        return menu;
    }

    /**
     * Creates the Face submenu
     * @return the menu
     */
    public JMenu createFaceMenu() {
        JMenu menu = new JMenu("Face");
        menu.add(createFaceItem("Serif"));
        menu.add(createFaceItem("SansSerif"));
        menu.add(createFaceItem("Monospaced"));
        return menu;
    }

    /**
     * Creates the Size submenu
     * @return the menu
     */
    public JMenu createSizeMenu() {
        JMenu menu = new JMenu("Size");
        menu.add(createSizeItem("Smaller", -1));
        menu.add(createSizeItem("Larger", 1));
        return menu;
    }

    /**
     * Creates the Style submenu.
     * @return the menu
     */
    public JMenu createStyleMenu() {
        JMenu menu = new JMenu("Style");
        menu.add(createStyleItem("Plain", Font.PLAIN));
        menu.add(createStyleItem("Bold", Font.BOLD));
        menu.add(createStyleItem("Italic", Font.ITALIC));
        menu.add(createStyleItem("Bold Italic", Font.BOLD + Font.ITALIC));
        return menu;
    }

    /**
     * Creates a menu item to change the font face and set its action listener.
     * @param name the name of the font face
     * @return the menu item
     */
    public JMenuItem createFaceItem(final String name) {
        class FaceItemListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                faceName = name;
                setLabelFont();
            }
        }

        JMenuItem item = new JMenuItem(name);
        item.addActionListener(new FaceItemListener());
        return item;
    }

    /**
     * Creates a menu item to change the font size and set its action listener.
     * @param name the name of the menu item
     * @param increment the amount by which to change the size
     * @return the menu item
     */
    public JMenuItem createSizeItem(String name, final int increment) {
        class SizeItemListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontSize += increment;
                setLabelFont();
            }
        }

        JMenuItem item = new JMenuItem(name);
        item.addActionListener(new SizeItemListener());
        return item;
    }

    /**
     * Creates a menu item to change the font style and set its action listener.
     * @param name the name of the menu item
     * @param style the new font style
     * @return the menu item
     */
    public JMenuItem createStyleItem(String name, final int style) {
        class StyleItemListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontStyle = style;
                setLabelFont();
            }
        }

        JMenuItem item = new JMenuItem(name);
        item.addActionListener(new StyleItemListener());
        return item;
    }

    /**
     * Sets the font of the text sample.
     */
    public void setLabelFont() {
        Font f = new Font(faceName, fontStyle, fontSize);
        label.setFont(f);
    }
}
