package planner;
import java.util.Scanner;
import java.util.regex.Pattern;
public class TimeBlock {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int MINUTES_PER_DAY = MINUTES_PER_HOUR * HOURS_PER_DAY;
    private static final int INTERVAL_MINUTES = 30;
    
    public static final TimeBlock[] LIST = createList();
    private static TimeBlock[] createList() {
        TimeBlock[] list = new TimeBlock[MINUTES_PER_DAY / INTERVAL_MINUTES];
        for(int time = 0, i = 0; time < MINUTES_PER_DAY; i++,time += INTERVAL_MINUTES) {
            list[i] = new TimeBlock(time);
        }
        return list;
    }
    
    public static TimeBlock fromMinutes(int minutes) {
        return LIST[minutes / INTERVAL_MINUTES];
    }
    
    public static TimeBlock fromTime(int hours, int minutes) {
        return fromMinutes(minutes + hours * MINUTES_PER_HOUR);
    }
    
    public static TimeBlock fromString(String s) {
        Scanner scan = new Scanner(s);
        scan.useDelimiter(Pattern.compile(":"));
        int hours = scan.nextInt();
        int minutes = scan.nextInt();
        return fromTime(hours, minutes);
    }
    
    private int minutes;
    private TimeBlock(int minutes) {
        this.minutes = minutes;
    }
    
    public int minutesPastHour() {
        return minutes % MINUTES_PER_HOUR;
    }
    
    public int hours() {
        return minutes / MINUTES_PER_HOUR;
    }
    
    public String toString() {
        return String.format("%02d:%02d", hours(), minutesPastHour());
    }
}