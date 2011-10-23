package planner.ui;
import planner.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Dimension;
import planner.Weekday;
public class TimeBlockTable extends JComponent {
    private static final Weekday[] COLUMN_HEADERS = Weekday.DAYS;
    private static final TimeBlock[] ROW_HEADERS = TimeBlock.LIST;
    
    private static JButton[][] createButtons() {
        JButton[][] buttons = new JButton[ROW_HEADERS.length][COLUMN_HEADERS.length];
        for(int i = 0; i < buttons.length; i++) {
            for(int j = 0; j < buttons[0].length; j++) {
                buttons[i][j] = new JButton("");
            }
        }
        return buttons;
    }
    private JButton[][] buttons;
    public TimeBlockTable() {
        setLayout(new GridLayout(ROW_HEADERS.length + 1, COLUMN_HEADERS.length + 1));
        buttons = createButtons();
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