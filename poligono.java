import java.util.Scanner;

public class poligono
{
   public static void main(String[]arg)
    {
    Scanner teclado = new Scanner(System.in);
    double n,s,area;
    
    
    System.out.println("ingrese longitud : ");
    s = teclado.nextInt();
          
    System.out.println("ingrese numero de lados =");
    
    n = teclado.nextInt();
    
     System.out.print("area del poligono:" );
       
    System.out.println((n*Math.pow(s,2))/(4*Math.tan(Math.PI/n)));
     
    
    }
}