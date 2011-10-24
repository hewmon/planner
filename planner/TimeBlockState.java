package planner;
import java.awt.Color;
public enum TimeBlockState {
    ALLOWED("Allowed", Color.GREEN, 0),
    ALLOWED_EMAIL("Allowed for email", Color.BLUE, 1),
    ALLOWED_BROWSING("Allowed for browsing", new Color(128, 0, 128), 2),
    ALLOWED_GAMES("Allowed for games", new Color(150, 75, 0), 3),
    DENIED("Denied", Color.RED, 4);
    
    private static final TimeBlockState[] STATES = {
        ALLOWED,
        ALLOWED_EMAIL,
        ALLOWED_BROWSING,
        ALLOWED_GAMES,
        DENIED
    };
    
    private final Color color;
    private final int ordinal;
    private final String description;
    TimeBlockState(String description, Color color, int ordinal) {
        this.description = description;
        this.color = color;
        this.ordinal = ordinal;
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