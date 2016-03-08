package fractale;

import java.awt.Color;
import java.awt.Graphics;


public class Koch {
    
    int iteration;
    
    Color colorWheel[];
    
    int colorIdx;
    
    double x;
    double y;
     

        public Koch()
        {
            
            colorWheel = new Color[800];
            colorIdx = 0;
            
            x = 120;
            y = 160;
           
        }


        public void kochcurve(Graphics g, int iteration, double d, double d1)
        {
            
           
            d %= 360;
            
            if(d > 180)
                d -= 360;
            
            if(d < -180)
                d += 360;
                        
            if(iteration == 1)
            {
                
                double d2 = (d * 3.1415926535897931) / 180;
                double d3 = x + d1 * Math.cos(d2);
                double d4 = y + d1 * Math.sin(d2);
                
                g.setColor(colorWheel[colorIdx]);
                g.drawLine((int)x, (int)y, (int)d3, (int)d4);
                
                x = d3;
                y = d4;
                if(++colorIdx >= 800)
                   colorIdx = 0;
            } 
            else
            {
                 
              
                kochcurve(g, iteration - 1, d, d1 / 3);
                kochcurve(g, iteration - 1, d - 60, d1 / 3);
                kochcurve(g, iteration - 1, d + 60, d1 / 3);
                kochcurve(g, iteration - 1, d, d1 / 3);
            }
        }

      
        public void setIteration(int it)
        {
            this.iteration = it;
        }

}