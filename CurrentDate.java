import java.util.GregorianCalendar;
import java.util.Calendar;

public class CurrentDate {
    public static void main(String[] args) {
        // Create an instance of GregorianCalendar for the current date
        GregorianCalendar calendar = new GregorianCalendar();

        // Get the current year, month, and day
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        // Display the current year, month, and day
        // Note: Months are zero-based, so we add 1 to the month
        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1));
        System.out.println("Day: " + day);
    }
}
