package fractale;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;



public class Option extends JPanel{

    
    public Option()
    {
        this.setPreferredSize(new Dimension(200, 650));
        this.setBackground(Color.WHITE);
        this.setBorder(new LineBorder(Color.BLUE, 2));
    }
}