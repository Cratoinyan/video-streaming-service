import javax.swing.*;
import java.awt.*;

public class vss {
    public static void main(String args[])
    {

        StartupScreen startupScreen = new StartupScreen();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        startupScreen.setTitle("VSS");
        startupScreen.setSize((screen.width/3), (screen.height/3));
        startupScreen.setVisible(true);
        startupScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
