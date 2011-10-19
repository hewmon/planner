package planner;
import planner.ui.*;
public class Application {
    private MainWindow mainWindow;
    public Application(String[] args) {
        mainWindow = new MainWindow();
    }
    
    public void run() {
        mainWindow.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Application(args).run();
    }
}