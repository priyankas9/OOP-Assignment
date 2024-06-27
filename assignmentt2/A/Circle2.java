public class Circle2 {
    private double radius = 1.0;
    private String color = "red";

    // Default constructor
    public Circle2() {
    }

    // Constructor with radius
    public Circle2(double radius) {
        this.radius = radius;
    }

    // Constructor with radius and color
    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to get area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to get circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
