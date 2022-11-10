package ch12;

import java.util.ArrayList;

/**
 * Describes an invoice for a set of purchased products.
 */
public class Invoice {
    private final Address billingAddress;
    private final ArrayList<LineItem> items;

    public Invoice(Address address) {
        items = new ArrayList<>();
        billingAddress = address;
    }

    /**
     * Adds a charge for a product to this invoice.
     * @param product the product that the customer ordered
     * @param quantity the quantity of the product
     */
    public void add(Product product, int quantity) {
        LineItem item = new LineItem(product, quantity);
        items.add(item);
    }

    /**
     * Formats the invoice.
     * @return the formatted invoice.
     */
    public String format() {
        StringBuilder r = new StringBuilder(String.format("%36s\n\n", "I N V O I C E")
                + billingAddress.format()
                + String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total"));

        for (var item : items) {
            r.append(item.format()).append("\n");
        }

        r.append(String.format("\nAMOUNT DUE: $%8.2f", getAmountDue()));

        return r.toString();
    }

    /**
     * Computes the total amount due.
     * @return the amount due
     */
    private double getAmountDue() {
        double amountDue = 0;
        for (var item : items) {
            amountDue += item.getTotalPrice();
        }
        return amountDue;
    }
}
