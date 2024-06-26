import java.util.GregorianCalendar;
import java.util.Calendar;

public class CurrentDate {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1));
        System.out.println("Day: " + day);
    }
}
