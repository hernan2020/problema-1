import java.util.Scanner;


public class sasaima
{
   public static void main(String[]arg)
    {
    Scanner teclado = new Scanner(System.in);
    
    int capacidad, carga;
    double combustible;
          
                    
    
    System.out.println("kilos en el camion a transportar: ");
     capacidad= teclado.nextInt();
     System.out.println("kilometros recorrido : ");
     carga= teclado.nextInt();
     System.out.println("consumo de gasolina por kilometro : ");
     combustible= teclado.nextDouble();
     
     viaje(capacidad,carga,combustible);
 




    }
    
    public static void viaje(double capacidad, double carga,double combustible)
    
    {
        double distancia= 80;
    
        combustible=10000;
    
        double nviajes=carga/ capacidad;
    
        boolean viaje_2= carga % capacidad !=0 ? true : false;
    
    
   
        if(viaje_2)
        {
            nviajes ++;
        }
    
        double gas_usado=combustible * distancia;
        double total_gasolina= gas_usado * nviajes ;
        double ngalones=gas_usado * combustible;
    
        System.out.println("se requiere viajes: "+nviajes);
        System.out.println("el camion utilizara # de galones: "+ ngalones);
        System.out.println("valor total de gasolina: "+ total_gasolina);
    
    
     
    }
}