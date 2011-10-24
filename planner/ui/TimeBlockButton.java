package planner.ui;
import planner.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Map;
import java.awt.Color;
public class TimeBlockButton extends AbstractButton {
    private static final String uiClassID = "TimeBlockButtonUI";
    
    private final ChangeListener modelChangeListener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
            updateBackground();
        }
    };

    public TimeBlockButton(TimeBlockState defaultState) {
        setModel(new TimeBlockButtonModel(defaultState));
        init(null, null);
        updateBackground();
    }
    
    private void updateBackground() {
        setBackground(getState().getColor());
    }
    
    public void setUI(TimeBlockButtonUI ui) {
        super.setUI(ui);
    }
    
    public void updateUI() {
        if(UIManager.get(getUIClassID()) != null)
            setUI((TimeBlockButtonUI) UIManager.getUI(this));
        else
            setUI(TimeBlockButtonUI.createUI(this));
    }
    
    public TimeBlockButtonUI getUI() {
        return (TimeBlockButtonUI) ui;
    }
    
    public String getUIClassID() {
        return uiClassID;
    }
    
    public TimeBlockButtonModel getModel() {
        return (TimeBlockButtonModel) super.getModel();
    }
    
    public void setModel(TimeBlockButtonModel model) {
        TimeBlockButtonModel oldModel = getModel();
        if(oldModel != null)
            oldModel.removeChangeListener(modelChangeListener);
        model.addChangeListener(modelChangeListener);
        super.setModel(model);
    }
    
    public void setState(TimeBlockState state) {
        getModel().setState(state);
    }
    
    public TimeBlockState getState() {
        return getModel().getState();
    }
}