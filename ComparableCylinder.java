public class ComparableCylinder extends Cylinder {
    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }

    public int compareVolume(ComparableCylinder o) {
        return Double.compare(this.getVolume(), o.getVolume());
    }

    @Override
    public String toString() {
        return "ComparableCylinder{radius=" + getRadius() + ", height=" + getHeight() + ", volume=" + getVolume() + "}";
    }
}
