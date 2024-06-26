public class RectangleTest {
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rect1 = new Rectangle(5, 50, "Yellow");
        Rectangle rect2 = new Rectangle(5, 50, "Yellow");

        // Display the properties of rect1
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + rect1.findArea());
        System.out.println("Perimeter: " + rect1.findPerimeter());

        // Display the properties of rect2
        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + rect2.findArea());
        System.out.println("Perimeter: " + rect2.findPerimeter());
    }
}
