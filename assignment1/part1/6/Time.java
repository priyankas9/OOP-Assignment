import java.util.Calendar;
import java.util.TimeZone;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }


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
