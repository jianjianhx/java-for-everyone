package ch10;

import javax.swing.*;

public class InvestmentFrame2 extends JFrame {
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 100;

    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;

    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private final JLabel resultLabel;

    private double balance;

    public InvestmentFrame2() {
        balance = INITIAL_BALANCE;

        resultLabel = new JLabel("Balance: " + balance);

        createTextField();
        createButton();
        createPanel();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField()
    {
        rateLabel = new JLabel("Interest Rate: ");

        final int FIELD_WIDTH = 10;
        rateField = new JTextField(FIELD_WIDTH);
        rateField.setText("" + DEFAULT_RATE);
    }

    private void createButton() {
        button = new JButton("Add Interest");

        button.addActionListener(e -> {
            double rate = Double.parseDouble(rateField.getText());
            double interest = balance * rate / 100;
            balance += interest;
            resultLabel.setText("Balance: " + balance);
        });
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        panel.add(resultLabel);
        add(panel);
    }
}
