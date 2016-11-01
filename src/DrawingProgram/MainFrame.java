
package DrawingProgram;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Graphics;

public class MainFrame extends JFrame {
MainFrame()
    {
        super("My paint program");
        MainPanel mPanel = new MainPanel();
        getContentPane().add(mPanel);
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
