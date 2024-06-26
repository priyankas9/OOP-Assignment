public class Rectangle {
    private double width;
    private double height;


    private static String color;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
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
}
