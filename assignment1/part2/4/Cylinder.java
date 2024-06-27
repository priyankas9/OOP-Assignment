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

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder{radius=" + getRadius() + ", height=" + height + ", volume=" + getVolume() + ", area=" + getArea() + "}";
    }
}
