import java.util.Scanner;
 
class arimetica {
 
    public static void main( String args[] )
    {
 
        Scanner teclado = new Scanner(System.in);
        System.out.print( "escriba el primer número: " );
        int primerNumero = teclado.nextInt();
        System.out.print( "escriba el segundo número: " );
        int segundoNumero = teclado.nextInt();
        
                      
        System.out.print( "Su suma es: " );
        System.out.println( primerNumero+segundoNumero );
        System.out.print( "la resta es: " );
        System.out.println( segundoNumero-primerNumero );
        System.out.print( "la multiplicacion es: " );
        System.out.println( primerNumero*segundoNumero );
        System.out.print( "coeficiente es: " );
        System.out.println( primerNumero/segundoNumero );
        System.out.print( "residuo es: " );
        System.out.println( primerNumero%segundoNumero );
        System.out.print( "valor del exponente es: " );
        System.out.println( Math.pow(primerNumero,segundoNumero) );
        System.out.print( "valor del log es: " );
        System.out.println((Math.log(primerNumero)));
        
        
    }
}