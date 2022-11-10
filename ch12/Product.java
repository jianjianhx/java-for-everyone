package ch12;

/**
 * Describes a product with a description and a price.
 */
public class Product {
    private final String description;
    private final double price;

    /**
     * Constructs a product from a description and a price.
     * @param description the product description
     * @param price the product price
     */
    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }
    /**
     * Gets the product description
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the product description
     * @return the description
     */
    public double getPrice() {
        return price;
    }
}
