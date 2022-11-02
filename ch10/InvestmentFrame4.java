package ch10;

import javax.swing.*;
import java.awt.*;

public class InvestmentFrame4 extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    private static final int CHAR_WIDTH = 300;
    private static final int CHAR_HEIGHT = 300;

    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;

    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private final ChartComponent3 chart;
    private double balance;

    public InvestmentFrame4() {
        balance = INITIAL_BALANCE;
        chart = new ChartComponent3(3 * INITIAL_BALANCE);
        chart.setPreferredSize(new Dimension(CHAR_WIDTH, CHAR_HEIGHT));
        chart.append(balance);

        createTextField();
        createButton();
        createPanel();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
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
            chart.append(balance);
        });
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        panel.add(chart);
        add(panel);
    }
}
