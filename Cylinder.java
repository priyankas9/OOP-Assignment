public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    private double getRadius() {
        // Use reflection or change the radius to protected if needed
        try {
            java.lang.reflect.Field field = Circle.class.getDeclaredField("radius");
            field.setAccessible(true);
            return field.getDouble(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cylinder{radius=" + getRadius() + ", height=" + height + ", volume=" + getVolume() + ", area=" + getArea() + "}";
    }
}
