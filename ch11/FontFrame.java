package ch11;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This frame contains a text sample and a control panel
 * to change the font of the text.
 */
public class FontFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private final JLabel label;
    private JCheckBox italicCheckBox;
    private JCheckBox boldCheckBox;
    private JRadioButton smallButton;
    private JRadioButton mediumButton;
    private JRadioButton largeButton;
    private JComboBox<String> faceNameCombo;
    private final ActionListener listener;

    /**
     * Constructs the frame.
     */
    public FontFrame() {
        // Construct text sample
        label = new JLabel("Big Java");
        add(label, BorderLayout.CENTER);

        // This listener is shared among all components
        listener = new ChoiceListener();

        createControlPanel();
        setLabelFont();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    class ChoiceListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setLabelFont();
        }
    }

    /**
     * Creates the control panel to change the font.
     */
    public void createControlPanel() {
        JPanel faceNamePanel = createComboBox();
        JPanel sizeGroupPanel = createCheckBoxes();
        JPanel styleGroupPanel = createRadioButtons();

        // Line up component panels
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 1));
        controlPanel.add(faceNamePanel);
        controlPanel.add(sizeGroupPanel);
        controlPanel.add(styleGroupPanel);

        // Add panels to content pane
        add(controlPanel, BorderLayout.SOUTH);
    }

    /**
     * Creates the combo box with the font style choices.
     * @return the panel containing the combo box
     */
    public JPanel createComboBox() {
        faceNameCombo = new JComboBox<>();
        faceNameCombo.addItem("Serif");
        faceNameCombo.addItem("SansSerif");
        faceNameCombo.addItem("Monospaced");
        faceNameCombo.setEditable(true);
        faceNameCombo.addActionListener(listener);

        JPanel panel = new JPanel();
        panel.add(faceNameCombo);
        return panel;
    }

    /**
     * Creates the checkboxes for selecting bold and italic styles.
     * @return the panel containing the checkboxes
     */
    public JPanel createCheckBoxes() {
        italicCheckBox = new JCheckBox("Italic");
        italicCheckBox.addActionListener(listener);
        boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.addActionListener(listener);

        JPanel panel = new JPanel();
        panel.add(italicCheckBox);
        panel.add(boldCheckBox);
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Style"));

        return panel;
    }

    /**
     * Creates the radio buttons to select the font size.
     * @return the panel containing the radio buttons.
     */
    public JPanel createRadioButtons() {
        smallButton = new JRadioButton("Small");
        smallButton.addActionListener(listener);

        mediumButton = new JRadioButton("Medium");
        mediumButton.addActionListener(listener);

        largeButton = new JRadioButton("Larger");
        largeButton.addActionListener(listener);
        largeButton.setSelected(true);

        // Add radio buttons to button group
        ButtonGroup group = new ButtonGroup();
        group.add(smallButton);
        group.add(mediumButton);
        group.add(largeButton);

        JPanel panel = new JPanel();
        panel.add(smallButton);
        panel.add(mediumButton);
        panel.add(largeButton);
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));

        return panel;
    }

    /**
     * Gets user choice for font name, style, and size
     * and sets the font of the text sample.
     */
    public void setLabelFont() {
        // Get font name
        String faceName = (String) faceNameCombo.getSelectedItem();

        // Get font style
        int style = Font.PLAIN;
        if (italicCheckBox.isSelected()) { style += Font.ITALIC; }
        if (boldCheckBox.isSelected()) { style += Font.BOLD; }

        // Get fond size
        int size = 0;
        final int SMALL_SIZE = 24;
        final int MEDIUM_SIZE = 36;
        final int LARGE_SIZE = 48;
        if (smallButton.isSelected()) { size = SMALL_SIZE; }
        else if (mediumButton.isSelected()) { size = MEDIUM_SIZE; }
        else if (largeButton.isSelected()) { size = LARGE_SIZE; }

        label.setFont(new Font(faceName, style, size));
        label.repaint();
    }
}
