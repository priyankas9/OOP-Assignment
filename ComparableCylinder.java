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

    private double getHeight() {
        // Use reflection or change the height to protected if needed
        try {
            java.lang.reflect.Field field = Cylinder.class.getDeclaredField("height");
            field.setAccessible(true);
            return field.getDouble(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
