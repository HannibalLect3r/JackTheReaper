package fractale;

public class Julia {
    
    
    public int iteration;
    
    public int[][] axe;
   
    public int lwin;
       public int hwin;
    
    private double ymax,ymin,xmin,xmax;
    
    private double ca, cb;
    
    public Julia(){
       
        
         hwin=710;
         lwin=710;
         axe = new int[lwin][hwin];
         ymax=2;
         ymin=-2;
         xmin=-2;
         xmax=2;
               
    }
   
    public void calcul(){
        
        int n;
        
        
        
        for(int i=0;i<hwin;i++)
        {
            for(int j=0;j<lwin;j++)
            {
                
                
                
                Complexe z = new Complexe((i*(xmax-xmin)/(double)(hwin) + xmin),(ymax -j*(ymax-ymin)/(double)(lwin)));
                Complexe c = new Complexe(ca,cb);
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
    
    
     public void setIteration(int it)
        {
            this.iteration = it;
        }
     
     
     public void setCaCb(double ca, double cb)
        {
            this.ca = ca;
            this.cb = cb;
        }
}

