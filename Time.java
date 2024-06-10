import java.util.Calendar;
import java.util.TimeZone;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor that sets the current time in GMT
    public Time() {
        // Get the current time in GMT
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    // Getter methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
