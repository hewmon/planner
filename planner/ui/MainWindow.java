package planner.ui;
import javax.swing.*;
public class MainWindow extends JFrame {
    private static String NAME = "Computer use planning and monitoring";
    public MainWindow() {
        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new TimeBlockTable());
        pack();
    }
}