package planner.ui;
import planner.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.util.Map;
public class TimeBlockTable extends JComponent {
    private static final Weekday[] COLUMN_HEADERS = Weekday.DAYS;
    private static final TimeBlock[] ROW_HEADERS = TimeBlock.LIST;
    
    private static TimeBlockButton[][] createButtons(TimeBlockState defaultState) {
        TimeBlockButton[][] buttons = new TimeBlockButton[ROW_HEADERS.length][COLUMN_HEADERS.length];
        for(int i = 0; i < buttons.length; i++) {
            for(int j = 0; j < buttons[0].length; j++) {
                buttons[i][j] = new TimeBlockButton(defaultState);
            }
        }
        return buttons;
    }
    private TimeBlockButton[][] buttons;
    public TimeBlockTable(TimeBlockState defaultState) {
        setLayout(new GridLayout(ROW_HEADERS.length + 1, COLUMN_HEADERS.length + 1));
        buttons = createButtons(defaultState);
        initGrid();
    }
    
    private void initGrid() {
        add(new Box.Filler(new Dimension(), new Dimension(), new Dimension()));
        for(int i = 0; i < COLUMN_HEADERS.length; i++)
            add(new JLabel(COLUMN_HEADERS[i].toString(), JLabel.CENTER));
        for(int i = 0; i < buttons.length; i++) {
            add(new JLabel(ROW_HEADERS[i].toString(), JLabel.CENTER));
            for(int j = 0; j < buttons[0].length; j++)
                add(buttons[i][j]);
        }
    }
}