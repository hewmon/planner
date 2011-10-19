package planner.ui;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Dimension;
import planner.Weekday;
public class TimeBlockTable extends JComponent {
    private static final String[] COLUMN_HEADERS = createDayNames();
    private static final String[] ROW_HEADERS = createTimeBlocks();
    private static String[] createDayNames() {
        String[] dayNames = new String[Weekday.DAYS.length];
        for(int i = 0; i < Weekday.DAYS.length; i++) {
            dayNames[i] = Weekday.DAYS[i].getName();
        }
        return dayNames;
    }
    private static String[] createTimeBlocks() {
        String[] timeBlocks = {"a", "b", "c"};
        return timeBlocks;
    }
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
        System.out.println(ROW_HEADERS.length);
        buttons = createButtons();
        initGrid();
    }
    
    private void initGrid() {
        add(new Box.Filler(new Dimension(), new Dimension(), new Dimension()));
        for(int i = 0; i < COLUMN_HEADERS.length; i++)
            add(new JLabel(COLUMN_HEADERS[i], JLabel.CENTER));
        for(int i = 0; i < buttons.length; i++) {
            add(new JLabel(ROW_HEADERS[i], JLabel.CENTER));
            for(int j = 0; j < buttons[0].length; j++)
                add(buttons[i][j]);
        }
    }
}