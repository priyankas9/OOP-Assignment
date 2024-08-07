public class RectangleTest {
    public static void main(String[] args) {
     
        Rectangle rect1 = new Rectangle(5, 50, "Yellow");
        Rectangle rect2 = new Rectangle(5, 50, "Yellow");

  
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + rect1.findArea());
        System.out.println("Perimeter: " + rect1.findPerimeter());

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + rect2.findArea());
        System.out.println("Perimeter: " + rect2.findPerimeter());
    }
}
