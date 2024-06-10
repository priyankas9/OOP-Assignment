public class TestTime {
    public static void main(String[] args) {
        // Create a Time object
        Time time = new Time();

        // Display hour, minute, and second using the get methods
        System.out.println("Current Time in GMT:");
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}
