

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Importamos la clase "java.util.*" para el uso del calendario en unos de los metodos mas adelante.
 * Creacion de la clase "Persona" (Abstraccion de una persona)
 * con diversos tipo de atributos: nroDni de tipo entero, apellido y nombre de tipo String y año de tipo entero
 * 
 * 
 * 
 * 
 * 
 * @author Vivero, Sergio Edgardo.
 * @version 24/08/24.
 */
public class Persona
{
 private int nroDni;
 private String nombre;
 private String apellido;
 private int anioNacimiento;
 private Calendar fechaNacimiento;
 
   /**
  * Creacion de una clase constructora del tipo persona que recibe como parametros los atributos vistos anteriomente.
  */
 public Persona (int p_dni,String p_nombre, String p_apellido, int p_anio){
     this.setNroDni(p_dni);
     this.setNombre(p_nombre);
     this.setApellido(p_apellido);
     this.setAnioNacimiento(p_anio); //clase constructora
 }
 
 
 /**
  * Creacion de una clase constructora del tipo persona que recibe como parametros los atributos vistos anteriomente.
  */
 public Persona (int p_dni,String p_nombre, String p_apellido, Calendar p_fechaNaci){
     this.setNroDni(p_dni);
     this.setNombre(p_nombre);
     this.setApellido(p_apellido);
     this.setFechaNacimiento(p_fechaNaci); //clase constructora
 }
 

 /**
  * Esto es el setter del atributo "nroDNI" para modificar y darle el valor del parametro recibido al mismo.
  */
 private void setNroDni(int p_dni){
     this.nroDni= p_dni;
 }
 
  /**
  * Esto es el setter del atributo "nombre" para modificar y darle el valor del parametro recibido al mismo.
  */
  private void setNombre(String p_nombre){
     this.nombre= p_nombre;
 }
 
  /**
  * Esto es el setter del atributo "apellido" para modificar y darle el valor del parametro recibido al mismo.
  */
  private void setApellido(String p_apellido){
     this.apellido= p_apellido;
 }
 
  /**
  * Esto es el setter del atributo "fechaNacimiento" para modificar y darle el valor del parametro recibido al mismo.
  */
  private void setFechaNacimiento(Calendar p_fechaNaci){
     this.fechaNacimiento= p_fechaNaci;
 }
 
   /**
  * Esto es el setter del atributo "anioNacimiento" para modificar y darle el valor del parametro recibido al mismo.
  */
  private void setAnioNacimiento(int p_anio){
     this.anioNacimiento= p_anio;
 }
 
 
  /**
  * Esto es el getter del atributo "nroDNI" nos sirve para acceder a su valor que es privado y retornarlo.
  */
  
 public  int getDni()
 {
    return this.nroDni;
 }
 
   /**
  * Esto es el getter del atributo "nombre" nos sirve para acceder a su valor que es privado y retornarlo.
  */
  
 public String getNombre(){
  return this.nombre;
 }
 
  /**
  * Esto es el getter del atributo "apellido" nos sirve para acceder a su valor que es privado y retornarlo
  */
  
 public String getApellido(){
    return this.apellido;
 }
 
   /**
  * Esto es el getter del atributo "fechaNacimiento" nos sirve para acceder a su valor que es privado y retornarlo
  */
 public Calendar getFechaNacimiento(){ //TRAER EL DATO QUE SE DESEA.
    return this.fechaNacimiento;
 }

    /**
  * Esto es el getter del atributo "anioNacimiento" nos sirve para acceder a su valor que es privado y retornarlo
  */
 public int getAnioNacimiento(){ 
    return this.anioNacimiento;
 }

 
   /**
  * El método edad() devuelve la cantidad de años cumplidos a la fecha,
  * considerando para el cálculo sólo la diferencia entre años.
  */
public int edad(){
    Calendar fechaActual = new GregorianCalendar();
    int anioHoy = fechaActual.get(Calendar.YEAR);
    return anioHoy - this.getAnioNacimiento();
}

/**
 * En este metodo de acceso publico se concatena dos cadenas la de nombre y apellido que accedemos a ello mediante el uso del get.
 *
 */
public String nomYApe(){
    return("nombre y apellido" + this.getNombre() + this.getApellido());//
}

/**
 * En este metodo de acceso publico se concatena dos cadenas la de apellido y nombre que accedemos a ello mediante el uso del get.
 *
 */
public String ApeYNom(){
    return( "apellido y nombre" + this.getApellido() + this.getNombre());
}

/**
 * En este metodo de acceso publico se muestra diferentes atributos de acceso privado mediante el uso del get.
 *
 */
public void mostrar (){
    System.out.println("Nombre:" + this.getNombre());
    System.out.println("Apellido:" + this.getApellido());
    System.out.println("DNI:" + this.getDni());
    System.out.println("Año" + this.getFechaNacimiento());

}

/*El método esCumpleaños() comprueba y
retorna true o false según sea o no el
cumpleaños de la persona en el día que se
ejecuta el programa.
En la clase Banco creada previamente, agregue
el envío del mensaje de cumpleaños, si cumple
la condición. */

public boolean esCumpleaños(Calendar fechaActual, Calendar fechaNacimiento){

    return (fechaActual.get(Calendar.DAY_OF_MONTH) ==  fechaNacimiento.get(Calendar.DAY_OF_MONTH)) 
    && (fechaActual.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH));
    }
}
