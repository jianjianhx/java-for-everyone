package ch10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentFrame extends JFrame {
    private JLabel resultLabel;
    private double balance;

    private static final double INTEREST_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;

    class AddInterestListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double interest = balance * INTEREST_RATE / 100;
            balance += interest;
            resultLabel.setText("Balance: " + balance);
        }
    }

    public InvestmentFrame() {
        balance = INITIAL_BALANCE;
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        JButton button = new JButton("Add Interest");
        button.addActionListener(new AddInterestListener());

        resultLabel = new JLabel("Balance: " + balance);

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(resultLabel);

        add(panel);
    }
}
