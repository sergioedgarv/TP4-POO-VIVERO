import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class AplicacionBanco here.
 * 
 * @author (Vivero, Sergio E. Valenzuela Lisandro) 
 * @version (20/9/24)
 */
public class AplicacionBanco
{
   public static void main (String[]args)
   {    
        Localidad localidad  = new Localidad("San Roque", "Corrientes");
        Banco banco = new Banco("Credicop", localidad, 5, new ArrayList<>());
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la opcion:  1-Ingresar 0-Salir (Por favor seleccione una opcion)");
        opcion = teclado.nextInt();
        do
        {
            System.out.println("Cuil:");
            long cuil=teclado.nextLong();
            teclado.nextLine();
            System.out.println("Apellido:");
            String apellido = teclado.nextLine();
            System.out.println("Nombre:");
            String nombre = teclado.nextLine();
            System.out.println("Sueldo");
            double sueldo = teclado.nextDouble();
            System.out.println("Año");
            int anio = teclado.nextInt();
            Empleado nuevoEmpleado = new Empleado(cuil,apellido,nombre,sueldo,anio);
            banco.agregarEmpleado(nuevoEmpleado);
            System.out.println("Desea seguir ingresando: 1-si 0-no");
            opcion=teclado.nextInt();
        } while(opcion==1);
        
        banco.mostrar();
        
        teclado.close();
   }
}