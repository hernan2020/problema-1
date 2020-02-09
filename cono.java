
import java.util.Scanner;
import java.lang.Math;


public class cono
{
    public static void main(String[]args)
  
    {

        Scanner teclado = new Scanner(System.in);
    
        double r1;
        double r2;
        double h1;
        double h2;
   
    
    
    
            System.out.println("digite el radio del cono ");
                r1 = teclado.nextDouble();
            System.out.println("digite la altura del cono ");
                h1 = teclado.nextDouble();
            System.out.println("digite la mitad del radio del cono ");
                r2 = teclado.nextDouble();
            System.out.println("digite la mitad de la altura del cono ");
                h2 = teclado.nextDouble();
    
     
         double resultado= cono(r1,r2,h1,h2);
         
                if(resultado==-1)
                    {
         
                        System.out.println("digito mal= negativo ");
         
    
                    }
                    
                else 
                    {
        
                        System.out.println("resultado del tronco del cono:"+ resultado);
        
    
                        double vol_figura=(Math.PI * Math.pow(r1,2))* h1;
                        double vol_figura2=(Math.PI * Math.pow(r2,2))* h2;
    
    
    

    
        }
    }
    
    public static double cono (double r1,double r2,double h1,double h2)
    
    {
            
        double vol_figura=(Math.PI * Math.pow(r1,2))* h1;
        double vol_figura2=(Math.PI * Math.pow(r2,2))* h2;
    
    
        if(vol_figura-vol_figura2 < 0)
        {
        return -1;       

    
       }
    return vol_figura-vol_figura2;
    }
}

