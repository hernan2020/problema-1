
import java.util.Scanner;

public class paseo
{
   public static void main(String[]args)
   {
   
       Scanner teclado = new Scanner(System.in);     
   
             
          
     System.out.println("digite la cantidad de estudiantes gordos : ");
     int estudiante_gordo = teclado.nextInt();
     System.out.println("digite la cantidad de estudiantes flacos:");
     int estudiante_falco= teclado.nextInt();
     System.out.println("dias de viaje : ");
     int dias_viaje=teclado.nextInt();
          
     int valor_habitacion=25000;
     
     
    
     System.out.println("cantidad de buses: "+ num_buses(estudiante_gordo,estudiante_falco ));
     
     comida(estudiante_gordo,estudiante_falco,dias_viaje);
   
   
    }
    
    public static int num_buses(int estudiante_gordo,int estudiante_falco)
    
    {
    
        int capacidad_bus=60;
        int t_asientos_gordos= estudiante_gordo * 2;
        int asiento_usuados = t_asientos_gordos + estudiante_falco;
        int totalbuses= asiento_usuados / capacidad_bus;
        
        boolean primer= asiento_usuados % capacidad_bus !=0 ? true : false;
     
     
        if(primer)
        {
            totalbuses ++;
        }
        return totalbuses;
    
    }
    
    public static void comida(int estudiante_gordo,int estudiante_falco,int dias_viaje)  
    
      {
          int precio_comida=10000;
          int platos_diarios=estudiante_gordo * 5 + estudiante_falco * 3;
          int valor_diario=platos_diarios * precio_comida;
          int total_platos_viaje= platos_diarios * dias_viaje;
          int total_valor_viaje=valor_diario * dias_viaje;
      
          System.out.println("numero de platos diarios servidos :"+ platos_diarios);      
          System.out.println("el valor diario es: "+ valor_diario);
          System.out.println("numero de platos servidos en el viaje :"+ total_platos_viaje);
          System.out.println("el valor a pagar por el viaje :"+ total_valor_viaje);
        }
        
    public static int habitaciones(int estudiante_gordo,int estudiante_falco)
    
            {
                int total_estudiantes= estudiante_gordo + estudiante_falco;
                int total_habitaciones= total_estudiantes / 4;
                
                boolean habitacion_2= total_estudiantes % 4 !=0 ? true : false;
                
                
                if(habitacion_2)
                {
                    total_habitaciones ++;
                }
                return total_habitaciones;
    
            }
}