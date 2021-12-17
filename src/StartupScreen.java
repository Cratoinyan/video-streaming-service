import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartupScreen extends JFrame{
    private JButton logInButton, signInButton;
    public StartupScreen(){
        Container container = getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);

        logInButton = new JButton("Log in");
        signInButton = new JButton("Sign in");

        container.add(logInButton);
        container.add(signInButton);
    }
}
