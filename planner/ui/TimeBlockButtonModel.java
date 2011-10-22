package planner.ui;
import planner.*;
import javax.swing.*;
public class TimeBlockButtonModel extends DefaultButtonModel {
    private TimeBlockState state;
    
    public TimeBlockButtonModel(TimeBlockState defaultState) {
        this.state = defaultState;
    }
    
    public void setState(TimeBlockState state) {
        this.state = state;
        fireStateChanged();
    }
    
    public TimeBlockState getState() {
        return state;
    }
}