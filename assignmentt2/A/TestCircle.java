public class TestCircle {
    public static void main(String[] args) {
        // Test default constructor
        Circle2 c1 = new Circle2();
        System.out.println(c1); // Circle[radius=1.0, color=red]

        // Test constructor with radius
        Circle2 c2 = new Circle2(2.5);
        System.out.println(c2); // Circle[radius=2.5, color=red]

        // Test constructor with radius and color
        Circle2 c3 = new Circle2(3.5, "blue");
        System.out.println(c3); // Circle[radius=3.5, color=blue]

        // Test getColor method
        System.out.println("Color of c3: " + c3.getColor()); // Color of c3: blue

        // Test setting radius and color
        Circle2 c4 = new Circle2();
        c4.setRadius(5.5);
        System.out.println("Radius of c4: " + c4.getRadius()); // Radius of c4: 5.5
        c4.setColor("green");
        System.out.println("Color of c4: " + c4.getColor()); // Color of c4: green

        // Test toString method explicitly
        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString()); // Circle[radius=5.5, color=red]

        // Test toString method implicitly
        Circle c6 = new Circle(6.6);
        System.out.println(c6); // Circle[radius=6.6, color=red]
        System.out.println("Operator '+' invokes toString() too: " + c6); // Operator '+' invokes toString() too: Circle[radius=6.6, color=red]
    }
}
