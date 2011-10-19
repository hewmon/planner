package planner.ui;
import javax.swing.*;
public class MainWindow extends JFrame {
   private static String NAME = "Computer use planning and monitoring";
   public MainWindow() {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       add(new TimeBlockTable());
       pack();
   }
}