public class ComparableCylinder extends Cylinder implements Comparable<ComparableCylinder> {
    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public int compareTo(ComparableCylinder o) {
        return Double.compare(this.getVolume(), o.getVolume());
    }

    @Override
    public String toString() {
        return "ComparableCylinder{radius=" + getRadius() + ", height=" + getHeight() + ", volume=" + getVolume() + "}";
    }
}
