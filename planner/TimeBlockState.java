package planner;
import java.awt.Color;
public enum TimeBlockState {
    ALLOWED(Color.GREEN, 0),
    ALLOWED_EMAIL(Color.BLUE, 1),
    ALLOWED_BROWSING(new Color(128, 0, 128), 2),
    ALLOWED_GAMES(new Color(150, 75, 0), 3),
    DENIED(Color.RED, 4);
    
    private static final TimeBlockState[] STATES = {
        ALLOWED,
        ALLOWED_EMAIL,
        ALLOWED_BROWSING,
        ALLOWED_GAMES,
        DENIED
    };
    
    private final Color color;
    private final int ordinal;
    TimeBlockState(Color color, int ordinal) {
        this.color = color;
        this.ordinal = ordinal;
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