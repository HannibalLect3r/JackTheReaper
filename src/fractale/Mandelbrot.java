package fractale;

public class Mandelbrot {
    
    
    
    private int iteration;
    
    public int[][] axe;
   
    private int lwin;
    private int hwin;
    
    private double ymax,ymin,xmin,xmax;
    
    public Mandelbrot(){
       
        
         hwin=700;
         lwin=700;
         axe = new int[lwin][hwin];
                   
    }
   
    public void calcul(){
        
        int n;
        
        
        
        for(int i=0;i<hwin;i++)
        {
            for(int j=0;j<lwin;j++)
            {
                
                Complexe c = new Complexe((i*(xmax-xmin)/(double)(hwin) + xmin),(ymax - j*(ymax-ymin)/(double)(lwin)));
                Complexe z = new Complexe(0,0);
                n=0;
                
                while((n<iteration) && (z.norme2()<4))
                {
                    n++;
                    
                    z=(z.carre()).somme(c);
                }
                
               if(n<iteration)
                    axe[i][j]=n;
                else
                    axe[i][j]=0;
            }
        }
        
    }
    
    
    public void setCoord(double xmin,double xmax, double ymin, double ymax)
     {
        
         this.xmin = xmin;
         this.xmax = xmax;
         this.ymin = ymin;
         this.ymax = ymax;
             
     }
    
    
     public void setIteration(int it)
        {
            this.iteration = it;
        }
}