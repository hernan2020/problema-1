
import java.util.Scanner;

public class area

{
    
    public static void main(String[]args)
    
    {
      double a,r;
       double volumen;
       Scanner teclado = new Scanner(System.in);
       System.out.print("radio del circulo= ");
       r=teclado.nextDouble();   
       a=Math.PI*(r*r);
       volumen=(4/3)*Math.PI*(r*r*r);
       System.out.println("area del circulo=" +a+ "\n volumen=" +volumen);
      
       
    }

    }

