package planner;
import java.awt.Color;
public enum TimeBlockState {
    ALLOWED("Allowed", "Allowed for everything", Color.GREEN, 0),
    ALLOWED_BROWSING("Browsing", "Allowed for other browsing activities", Color.GRAY, 1),
    ALLOWED_SOCIAL("Social", "Allowed for social activities such as facebook and email", Color.BLUE, 2),
    ALLOWED_GAMING("Gaming", "Allowed for gaming", new Color(128, 0, 128), 3),
    ALLOWED_SHOPPING("Shopping", "Allowed for shopping activities", Color.YELLOW, 4),
    DENIED("Denied", "Denied for Everything", Color.RED, 5);
    
    private static final TimeBlockState[] STATES = {
        ALLOWED,
        ALLOWED_BROWSING,
        ALLOWED_SOCIAL,
        ALLOWED_GAMING,
        ALLOWED_SHOPPING,
        DENIED
    };
    
    private final Color color;
    private final int ordinal;
    private final String description;
    private final String name;
    TimeBlockState(String name, String description, Color color, int ordinal) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.ordinal = ordinal;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getOrdinal() {
        return ordinal;
    }
    
    public TimeBlockState successor() {
        return STATES[(ordinal + 1) % STATES.length];
    }
}