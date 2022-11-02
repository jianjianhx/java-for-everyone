package ch13;

/**
 * A triangular shape composed of stacked unit squares like this:
 * []
 * [][]
 * [][][]
 * ...
 */
public class Triangle {
    private final int width;

    public Triangle(int width) {
        this.width = width;
    }

    public int getArea() {
        if (width <= 0) { return 0; }
        else if (width == 1) { return 1; }
        else {
            Triangle smallerTriangle = new Triangle(width - 1);
            int smallerArea = smallerTriangle.getArea();
            return smallerArea + width;
        }
    }
}
