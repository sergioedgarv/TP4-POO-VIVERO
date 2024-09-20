import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class Banco here.
 * 
 * @author (Vivero, Sergio E.) 
 * @version (17/9/24)
 */
public class Banco
{
    private String nombre;
    private int nroSucursal;
    private ArrayList<Empleado> empleados;
    private Localidad localidad;
    private Empleado empleado;
    private ArrayList<CuentaBancaria> cuentas;
    private Persona personas;
   // private CuentaBancaria cuenta;
    // se hara tipo un CuentaBancaria cuentas; ??? quizá
    
  /*  HashSet<String> nombres = new HashSet<>();*/

     /**
     * Constructor de la clase Banco que inicializa los atributos
     * con los valores proporcionados como parámetros.
     */
    public Banco(String p_nombre, Localidad p_localidad,
    int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(p_empleado);
    }
    
     /**
     * Constructor de la clase Banco que inicializa los atributos
     * con los valores proporcionados como parámetros.
     */
    public Banco(String p_nombre, Localidad p_localidad,
    int p_nroSucursal, ArrayList<Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados,
     ArrayList<CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
        //HashSet<String> nombres = new HashSet<>();
    }
    
    //SETTERS
     /**
     * Setter del atributo nombre
     * Asigna p_nombre al nombre del empleado.
     * @param Recibe un parámetro p_nombre del tipo String.
     */
    private void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }


    /**
     * Setter del atributo nombre
     * Asigna p_nombre al nombre del empleado.
     * @param Recibe un parámetro p_nombre del tipo String.
     */
    private void setLocalidad(Localidad p_localidad){
        this.localidad= p_localidad;
    }

    /**
     * Setter del atributo NroSucursal
     * Asigna p_nroSucursal al numero de la  nroSucursal.
     * @param Recibe un parámetro p_nroSucursal del tipo int.
     */
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal= p_nroSucursal;
    }
    
     /**
     * Setter del atributo empleado
     * Asigna p_empleado al nombre del empleado.
     * @param Recibe un parámetro p_nombre del tipo String.
     */
    private void setEmpleado(Empleado p_empleado){
        this.empleado= p_empleado;
    }

      /**
     * Setter del atributo empleados
     * Asigna p_empleado al nombre del empleado.
     * @param Recibe un parámetro p_nombre del tipo String.
     */
    private void setEmpleados(ArrayList<Empleado> p_empleado){
        this.empleados= p_empleado;
    }

     /**
     * Setter del atributo cuentas
     *@param Recibe un parámetro p_cuenta del tipo CuentaBancaria.
     * Asigna p_cuentas a cuentas de la clase CuentaBancaria
     */
    private void setCuentas(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentas= p_cuentas;
    }
    
    private void setPersonas(Persona p_personas){
        this.personas= p_personas;
    }
    //GETTERS
    
    /**
     * Getter del atributo nombre
     * @return retorna el nombre del empleado.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Getter del atributo localidad
     * @return retorna la localidad de la clase Localidad.
     */
    public Localidad getLocalidad(){
        return this.localidad;
    }

     /**
     * Getter del atributo nroSucursal
     * @return retorna el nroSucursal del Banco.
     */
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    /**
     * Getter del atributo Empleado
     * @return retorna el empleado de la clase Empleado.
     */
    public Empleado getEmpleado(){
        return this.empleado;
    }

     /**
     * Getter del atributo  Empleados.
     * @return retorna empleados del Array Empleado.
     */
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
     /**
     * Getter del atributo  Cuentas.
     * @return retorna cuentas del Array CuentaBancaria.
     */
    public ArrayList<CuentaBancaria> getCuentas(){
        return this.cuentas;
    }
    
      /* public CuentaBancaria getCuentas(){
        return this.cuentas;
    }*/
    
    public Persona getPersonas(){
        return this.personas;
    }
    
    //METODOS
    /**
     * Metodo booleano denominado "agregarEmpleado"
     * @param recibe p_empleado
     * @return agrega del empleado.
     */
    public boolean agregarEmpleado(Empleado p_empleados){
        return this.getEmpleados().add(p_empleados);
    }

    /**
     * Metodo booleano denominado "quitarEmpleado"
     * @param recibe p_empleado
     * @return remueve el empleado.
     */
    public boolean quitarEmpleado(Empleado p_empleados){
        return this.getEmpleados().remove(p_empleados);
    }

    /**
     * Metodo de tipo void denominado "listarSueldos"
     * El cual implementa un for para acceder a la coleccion de "Empleados" 
     * con el objetivo de imprimir el metodo mostrar linea.
     */
    public void listarSueldos(){
        for(Empleado emp: this.getEmpleados()){
            System.out.println(emp.mostrarLinea());

        }

    }

    /**
     * Metodo double denominado "sueldosAPagar"
     * Se crea una variable temporal para almecanr el total del Sueldo
     * Se implementa un for para acceder a la colleccion "Empleados" para luego acceder al metodo "sueldoNeto"
     * de la clase Empleado
     * @return retorna el totalSueldo.
     */
    public double sueldosAPagar(){
        double totalSueldo= 0;
        for(Empleado emp: this.getEmpleados()){
            totalSueldo += emp.sueldoNeto();
        }
        return  totalSueldo;
    }

    /**
     * Metodo void denominado "mostrar"
     * Se encarga de mostrar informacion sobre el banco: Su nombre, Sucursal y nro de Sucursal
     * Tambien trabaja en colaboracion con la clase Localidad para mostrar justamente el mismo y la provinvia
     * Se implementa el uso del for para acceder a la coleccion de "Empleados" con el objeitvo de acceder al metodo 
     * "mostrarLinea" para imprimirlo
     * Tambien imprirmir todos los sueldos a pagar del metodo nombrado anteriormente.
     */
    public void mostrar(){
        System.out.println("Banco: " + this.getNombre() + " Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad" + this.getLocalidad().getNombre() + " Provincia:" + this.getLocalidad().getProvincia());
       for(Empleado emp: this.getEmpleados()){
            System.out.println(emp.mostrarLinea());

        }
        System.out.println("Total: " +this.sueldosAPagar());

    }


//NUEVOS METODOS 
    /* Metodo de tipo boolean denominado "agregarCuentaBancaria"
     * @return el añadir las cuentas mediante la funcion "add"
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuentas){
        return this.getCuentas().add(p_cuentas);
    }

    /* Metodo de tipo boolean denominado "quitarCuentaBancaria"
     * El cual primero comprueba si no existe mas cuentas para eliminar y en ese caso
     * @return false.
     * En caso de existir elimina dicha cuenta
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuentas){
         if(this.getCuentas() == null){
            return false;
            }else{
            return this.getCuentas().remove(p_cuentas);
            }
    }   

    public void listarCuentasConSaldoCero(){
        for(CuentaBancaria cb: this.getCuentas()){
         if(cb.getSaldo() == 0){
            System.out.println(cb.getTitular());
            } else{
            System.out.println("No existen cuentas con saldo cero");
            }
        /*if(this.getCuentas().mostrar().saldo()= 0){
            system.out.println("") + cuentas
        }*/
    }
    }   
    
//recorrer personas?? emprimir personas
        //
        public HashSet<String> ListaTitulares()
{
             HashSet<String> nombresTitulares = new HashSet<>();
             for(Persona cuents : this.getPersonas())
             {
                String nombreTitular = cuents.ApeYNom();
                nombresTitulares.add(nombreTitular);
             }
             return nombresTitulares;
            }
        
/*
       public HashSet<Persona> listaDeTitulares(){
          for (String nombre : nombres) {
            System.out.println(nombre.ApeYNom());
        }
        }
*/
    
    private int cuentasSaldoActivo(){
        int saldosActivos= 0;
        for(CuentaBancaria cb: this.getCuentas()){
            if(cb.getSaldo() > 0){
                saldosActivos= saldosActivos + 1;
            }
         
        }
        return saldosActivos;
    }
/*
Es responsabilidad del banco emitir un resumen, que tendrá el siguiente formato:
Banco: Rio - Sucursal: 3
Localidad: Saladas Provincia: Corrientes
************************************************************
RESUMEN DE CUENTAS BANCARIAS
************************************************************
Número total de Cuentas Bancarias: 2510
Cuentas Activas: 2352
Cuentas Saldo Cero: 158.
-------------------------------------------------------------------------------------------
Cuentas sin saldo:
--- Cuenta -------------------- Apellido y Nombre ---------------
14526387 Gomez, Marisa Esther
23145698 Villalba, Martín
----------------------------------------------------------------------------------------------------
Listado de Clientes: Gomez, Marisa Esther; Villalba, Martín; Zalazar, Ernesto
----------------------------------------------------------------------------------------------------
 */
    public void mostrarResumen(){

    }   
    
}   


