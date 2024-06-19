public abstract class GeometricObject implements Comparable<GeometricObject> {
    public abstract double getArea();

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) > 0) ? o1 : o2;
    }

    @Override
    public String toString() {
        return "GeometricObject{area=" + getArea() + "}";
    }
}
