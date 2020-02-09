import java.util.Scanner;

public class cine
{
    public static void main(String[]args)
    {
    int año_nacimiento;
    int edad, entrada_cine;
    
    Scanner teclado=new Scanner(System.in);
    
    System.out.print("digite el año en que nacio:");
    año_nacimiento= teclado.nextInt();
    
    edad = 2020-año_nacimiento;
    
        
        if(edad>=18)
       {
        entrada_cine=15000;
    }
    else
    {
        entrada_cine=500 * edad;
    }
    
    
    System.out.println("total a pagar:"+ entrada_cine);
    
    }
    
    

}
