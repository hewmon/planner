package planner;
public enum Weekday {
    SUNDAY("Sunday", 0),
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6);
    public static final Weekday[] DAYS =
        { SUNDAY,
          MONDAY,
          TUESDAY,
          WEDNESDAY,
          THURSDAY,
          FRIDAY,
          SATURDAY
        };
    
    private final String name;
    private final int ordinal;
    Weekday(String name, int ordinal) {
        this.ordinal = ordinal;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getOrdinal() {
        return ordinal;
    }
}