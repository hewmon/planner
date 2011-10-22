package planner.ui;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.*;
import java.awt.event.MouseEvent;
class TimeBlockButtonListener extends BasicButtonListener {
    public TimeBlockButtonListener(TimeBlockButton button) {
        super(button);
    }
    
    public void mouseClicked(MouseEvent e) {
        TimeBlockButton button = (TimeBlockButton) e.getSource();
        TimeBlockButtonModel model = button.getModel();
        System.out.println("mouse clicked, state changed from " + model.getState().toString() + "to " + model.getState().successor().toString());
        model.setState(model.getState().successor());
        button.repaint();
    }
}