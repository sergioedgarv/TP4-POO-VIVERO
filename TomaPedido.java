import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Write a description of class TomaPedido here.
 * 
 * @author Vivero, Sergio E.
 * @version 11032002
 */
public class TomaPedido
{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear laboratorio
        Laboratorio lab = new Laboratorio("Drogueria S.A", "P. Sherman Calle Wallaby 42, Sidney", "3794547259");
        Cliente client =  new Cliente(23, "Valenzuela", "lisi", 23.4);
        Calendar fechaPedido = Calendar.getInstance();
        Pedido pedido = new Pedido(fechaPedido, client, new ArrayList<>());
    
        // Ingreso de productos
     System.out.print("Ingrese el número de productos que desea agregar al pedido: ");
     int numProductos = scanner.nextInt();
     scanner.nextLine(); // Consumir el salto de línea
    
     for (int i=0; i < numProductos; i++ )
     {
        System.out.println("ingrese codigo: ");
        int codigo=scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("ingrese rubro: ");
        String rubro = scanner.nextLine();
        System.out.println("Ingrese descripcion:");
        String descrip=scanner.nextLine();
        System.out.println("Ingrese Costo:");
        double costo=scanner.nextDouble();
        System.out.println("Ingrese el stock");
        int stock=scanner.nextInt();
        System.out.print("Porcentaje de Punto de Reposición: ");
        double porcPtoRepo = scanner.nextDouble();
        System.out.print("Existencia Mínima: ");
        int existMinima = scanner.nextInt();
        //crear producto
        Producto producto = new Producto(codigo, rubro, descrip, costo,stock, porcPtoRepo, existMinima, lab);
        pedido.agregarProducto(producto);
    }
        scanner.close();
        pedido.mostrarPedido();    
      
    }

}