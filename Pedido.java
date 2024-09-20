
/**
 * Write a description of class Pedido here.
 * 
 * @author (Vivero, Sergio Edgardo) 
 * @version (14/9/2024)
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Pedido
{
    /*
     * Atributos
     */
    private Calendar fecha;
    private Cliente cliente;
    private ArrayList <Producto> productos;
    private Producto producto;
    /*
     * Metodo constructor de la clase Pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);

    }
    /*
     * Segundo metodo constructor de la clase Pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProducto(p_producto);
        this.productos = new ArrayList<>(); // Inicializar la lista
   // no es necesary     this.agregarProducto(p_producto); // Añadir el producto

    }

    /*
     * Aqui se encuentran los diferentes tipos de acceso "Setters y Getters"
     * sobre los atributos
     */

    private void setFecha(Calendar p_fecha){
        this.fecha= p_fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente= p_cliente;
    }

    private void setProductos(ArrayList <Producto> p_productos){
        this.productos= p_productos;
    }

    private void setProducto(Producto p_producto){
        this.producto= p_producto;
    }

    //GETTERS
    public Calendar getFecha(){
        return this.fecha;
     }

    public Cliente getCliente(){
        return this.cliente;
    }

    public ArrayList<Producto> getProductos(){
        return this.productos;
    }

    public Producto getProducto(){
        return this.producto;
    }
    
    //METODOS
    /*
     * En el metodo "TotalAlContado" se calcula el precio total al contado
     * Se define un for para acceder a la coleccion "productos"
     * @return retorna el total
     */
        public double totalAlContado() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.precioContado();
        }
        return total;
    }
    /*
     * En el metodo "TotalFinanciado" se calcula el precio total de lista
     * Se define un for para acceder a la coleccion "productos"
     * @return retorna el total
     */
    public double totalFinanciado() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.precioLista();
        }
        return total;
    }

    /*
     * Metodo de tipo booleano "agregarProducto" que recibe
     * @param p_producto 
     * @return y retorna que el parametro se agregue al array
     */
    public boolean agregarProducto(Producto p_producto){
        return this.productos.add(p_producto);
    }

    /*
     * Metodo de tipo booleano "quitarProducto" que recibe
     * @param p_producto 
     * @return y retorna que el parametro se quite al array
     */
    public boolean quitarProducto(Producto p_producto){
        return this.productos.remove(p_producto);
    }

     /*
     * Metodo de tipo void "MostrarPedido":
     * que imprime los detalles del pedido como fecha, tipo de producto, precio de lista
     * precio de contado, el total financiado y el total de contado
     */
    public void mostrarPedido(){
        System.out.println("******* Detalle del pedido ****** " + "Fecha:" + this.getFecha().getTime());
        System.out.println("Producto: Precio de Lista:  Precio de Contado:");
        System.out.println("--------------------------------------------------------");
                for (Producto producto : productos) {
            System.out.println(producto.mostrarLinea());
        }
       // System.out.println("" +productos + "" + String.format(" %.2f" + this.totalFinanciado()) + "" + String.format(" %.2f" + this.totalAlContado()));
        System.out.println("--------------------------------------------------------");
        System.out.println("*** Total ----- "+ String.format(" %.2f" + this.totalFinanciado()) + "" + String.format(" %.2f" + this.totalAlContado()));
    }


}

