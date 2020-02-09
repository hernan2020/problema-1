
import java.util.Scanner;

public class combustible

{
    
    public static void main(String[]arg)
    {
    Scanner teclado = new Scanner(System.in);
    
     double mpg,lpk,conversion;
     
     System.out.println("ingrese cantidad de combustible en mpg= ");
     
     mpg=0.4251;
     lpk=1.609;
     mpg = teclado.nextInt();   
     System.out.print( "coversion a lpk: " );
     System.out.println(conversion= mpg*lpk);
     
}
    
    
       
}  