public class Rectangles {
    // Private member variables
    private float length;
    private float width;

    // Default constructor
    public Rectangles() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    // Parameterized constructor
    public Rectangles(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public float getLength() {
        return length;
    }

    // Setter for length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter for width
    public float getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(float width) {
        this.width = width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangles[length=" + length + ", width=" + width + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        Rectangles rect1 = new Rectangles();
        Rectangles rect2 = new Rectangles(5.0f, 3.0f);

        // Testing the default constructor
        System.out.println("Default Rectangles: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Testing the parameterized constructor
        System.out.println("Parameterized Rectangles: " + rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        // Testing setters and getters
        rect1.setLength(2.0f);
        rect1.setWidth(4.0f);
        System.out.println("Updated Rectangles: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
    }
}
