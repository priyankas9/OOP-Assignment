public class GeometricObjectTest {
    public static void main(String[] args) {
        // Test max method with Circle objects
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);
        System.out.println("Larger Circle: " + GeometricObject.max(circle1, circle2));

        // Test max method with Cylinder objects
        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(4, 6);
        System.out.println("Larger Cylinder: " + GeometricObject.max(cylinder1, cylinder2));

        // Test ComparableCylinder objects
        ComparableCylinder comparableCylinder1 = new ComparableCylinder(3, 5);
        ComparableCylinder comparableCylinder2 = new ComparableCylinder(4, 6);
        System.out.println("Larger ComparableCylinder: " + (comparableCylinder1.compareTo(comparableCylinder2) > 0 ? comparableCylinder1 : comparableCylinder2));

        // Test Colorable Square
        Square square = new Square(4);
        System.out.println(square);
        square.howToColor();
    }
}
 