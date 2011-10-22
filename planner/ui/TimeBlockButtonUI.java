package planner.ui;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.*;
class TimeBlockButtonUI extends BasicButtonUI {
    private static TimeBlockButtonUI buttonUI = new TimeBlockButtonUI();
    
    private TimeBlockButtonUI() {
    }
    
    public static TimeBlockButtonUI createUI(TimeBlockButton button) {
        return buttonUI;
    }
   
    protected TimeBlockButtonListener createButtonListener(AbstractButton button) {
        return new TimeBlockButtonListener((TimeBlockButton)button);
    }
}