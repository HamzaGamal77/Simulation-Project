
package Simulation;

import java.text.DecimalFormat;



public class Simulation {
    
    public Simulation(){
    }

    public float avgnum(float λ,float m){
        float l=λ/(m-λ);
   
        return l;
    }
    public float avgtime(float λ,float m){
        float w=1/(m-λ);
       
        return w;
    }
    public float avgnumc(float λ,float m){
        float lq=(λ*λ)/(m*(m-λ));
    
        return lq;
    }
    public float avgtc(float λ,float m){
        float wq=λ/(m*(m-λ));

        return wq;
    }
    public float utilf(float λ,float m){
        float p=λ/m;
       
        return p;
    }
    public float percutet(float λ,float m){
        float po=1-(λ/m);
      
        return po;
    }

}

