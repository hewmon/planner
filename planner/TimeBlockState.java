package planner;
import java.awt.Color;
public enum TimeBlockState {
    DENIED(Color.RED, 0),
    ALLOWED(Color.GREEN, 1);
    
    private static final TimeBlockState[] STATES =
        { DENIED,
          ALLOWED
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
        System.out.println("ordinal " + ordinal);
        return STATES[(ordinal + 1) % STATES.length];
    }
}