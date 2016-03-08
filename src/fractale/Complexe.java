package fractale;

public class Complexe {
    
        public double re;
        public double im;
        
        public Complexe(double r, double i){
            this.re = r;
            this.im = i;
        }
        
        public Complexe (Complexe z) 
        {
            this.re = z.re; 
            this.im = z.im;
        }
    
        
        public Complexe somme(Complexe a){
            return new Complexe(a.re+re,a.im+im);
        }
        
        public Complexe carre(){
            return new Complexe(re*re-im*im,2*re*im);
        }
       
        
        public double norme2(){
            return re*re+im*im;
        }
        
        public String toString(){
            if(im>0)
                return re+"+i "+im;
            if(im<0)
                return re+"-i "+(-im);
            return re+"";
        }  
        
}