public class Rectangle {
    private double width;
    private double height;

    private static String color;


    public Rectangle() {
        this.width = 8.0;
        this.height = 8.0;
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        Rectangle.color = color;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static String getColor() {
        return color;
    }


    public static void setColor(String color) {
        Rectangle.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4.0, 5.0, "Blue");

        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + rect1.findArea());
        System.out.println("Perimeter: " + rect1.findPerimeter());

        Rectangle.setColor("Amber");

        System.out.println("Updated Color: " + Rectangle.getColor());
    }
}
