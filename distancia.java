

import java.util.Scanner;


public class distancia

{
    
    public static void main(String[]arg)
    {
    Scanner teclado = new Scanner(System.in);
    
     double lat1,long1,lat2,long2,distancia;
     
     distancia= 6371.07;
     
     System.out.println("digite la latitud Ciudad 1 =");
     lat1=teclado.nextInt();
     System.out.println("digite la longitud Ciudad 1= ");
     long1=teclado.nextInt();
     System.out.println("digite la latitud Ciudad 2 =");
     lat2=teclado.nextInt();
     System.out.println("digite la latitud Ciudad 2 = ");
     long2=teclado.nextInt();
     
     System.out.print( "la distancia es  =: ");
     System.out.println(6371.07 * Math.acos(Math.sin(lat1)) * Math.sin(lat2) + Math.cos(lat1)* Math.cos(lat2) * Math.cos(long1)-long2);
     
    }
}