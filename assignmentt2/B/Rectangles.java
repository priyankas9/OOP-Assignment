public class Rectangles {
    
    private float length;
    private float width;

 
    public Rectangles() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    
    public Rectangles(float length, float width) {
        this.length = length;
        this.width = width;
    }


    public float getLength() {
        return length;
    }


    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }


    public void setWidth(float width) {
        this.width = width;
    }

    
    public double getArea() {
        return length * width;
    }

   
    public double getPerimeter() {
        return 2 * (length + width);
    }

 
    @Override
    public String toString() {
        return "Rectangles[length=" + length + ", width=" + width + "]";
    }

   
    public static void main(String[] args) {
        Rectangles rect1 = new Rectangles();
        Rectangles rect2 = new Rectangles(5.0f, 3.0f);

       
        System.out.println("Default Rectangles: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

       
        System.out.println("Parameterized Rectangles: " + rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        
        rect1.setLength(2.0f);
        rect1.setWidth(4.0f);
        System.out.println("Updated Rectangles: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
    }
}
