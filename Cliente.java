
/**
 * La clase Cliente representa a un cliente con un número de DNI, apellido, nombre, y un saldo asociado.
 * 
 * Funcionalidad: Permite gestionar la información de un cliente, incluyendo su saldo,
 * y realizar operaciones para actualizar o consultar el saldo disponible.
 * 
 * Comportamiento: Los atributos se mantienen privados para asegurar el encapsulamiento,
 * y se proporcionan métodos públicos para interactuar con la información del cliente.
 */
public class Cliente
{

 private int Nrodni;
 private String apellido;
 private String nombre;
 private double saldo;

  /**
     * Constructor que inicializa una instancia de Cliente con los datos proporcionados.
     * 
     * Funcionalidad: Inicializa los atributos del cliente con los valores dados.
     * 
     * Comportamiento: Asigna los valores proporcionados a los atributos correspondientes.
     * 
     * @param p_dni El número de DNI del cliente.
     * @param p_apellido El apellido del cliente.
     * @param p_nombre El nombre del cliente.
     * @param p_importe El saldo inicial del cliente.
     */
 Cliente (int p_NroDni,String p_apellido,String p_nombre,Double p_Saldo)
 {
    this.setDNI(p_NroDni);
    this.setApellido(p_apellido);
    this.setName(p_nombre);
    this.setSaldo(p_Saldo);
 }

 //metodos
   /**
     * Reemplaza el saldo actual del cliente con un nuevo importe y devuelve el nuevo saldo.
     * 
     * Funcionalidad: Permite establecer un nuevo saldo, reemplazando el saldo anterior.
     * 
     * Comportamiento: El saldo actual se sobrescribe con el valor proporcionado.
     * 
     * @param p_importe El nuevo saldo que se asignará al cliente.
     * @return El nuevo saldo del cliente.
     */
 public double nuevoSaldo(double p_importe) //este metodo es un  como un setter pero que retorna el valor modificado.
 {
    this.saldo = p_importe; //actualiza el saldo actual.
    return this.saldo;// y lo retorna. 
 }



    /**
     * Agrega un importe al saldo actual del cliente y devuelve el nuevo saldo.
     * 
     * Funcionalidad: Incrementa el saldo actual del cliente con el importe proporcionado.
     * 
     * Comportamiento: El saldo se actualiza sumando el importe al saldo existente.
     * 
     * Mejoras: Se podría mejorar añadiendo validaciones para importes negativos o notificaciones de cambio.
     * if(p_importe < 0){
     *  this.saldo -= p_importe 
     * }
     * 
     * 
     * @param p_importe El importe que se agregará al saldo actual.
     * @return El nuevo saldo del cliente.
     */

 public double agregaSaldo(double p_importe)
 {
  this.saldo = this.saldo + p_importe; //otra forma mas sencilla seria this.saldo+= p_importe; pero deje el otro caso para que sea mas visible que se hace.
  return this.saldo;
 }
  /**
     * Retorna el nombre completo del cliente en el formato "Nombre ,Apellido ".
     * 
     * Funcionalidad: Proporciona el nombre completo del cliente en un formato específico.
     * 
     * Comportamiento: Los valores de apellido y nombre se concatenan con una coma y un espacio entre ellos.
     * 
     * @return Un String que contiene el apellido y nombre del cliente.
     */
 public String nomYapellido() 
 {
    return getNom()+","+ getApe();
 }

 public String apeYnomb()
 {
   return getApe()+","+getNom();
 }
 //getters
 public int getDni()
 {
    return this.Nrodni;
 }
 public double getSaldo(){
   return this.saldo;
}
 public String getNom()
 {
   return this.nombre;
 }
 public String getApe()
 {
   return this.apellido;
 }
 
//setters
private void setDNI (int p_dni)
{
  this.Nrodni=p_dni;
}

private void setName(String p_name){
   this.nombre=p_name;  
}
private void setApellido(String p_surname){
   this.apellido=p_surname;
}
private void setSaldo(double p_Saldo)
{
   this.saldo=p_Saldo;
}


    /**
     * Muestra en la consola los datos del cliente.
     * 
     * Funcionalidad: Imprime los datos básicos del cliente en la consola.
     */
 public void mostrar(){
    System.out.println("-Cliente-"); 
    System.out.println("Nombre y apellido:"+ nomYapellido()+ "("+getDni()+")");
    System.out.println("Saldo:" + getSaldo());
 }


}
