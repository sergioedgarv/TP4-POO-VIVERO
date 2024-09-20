import java.util.*;
/**
 * Write a description of class Curso here.
 * 
 * @author Vivero, Sergio E, Valenzuela, Lisandro.
 * @version 19/09/24.
 */
public class Curso{

    private String nombre;
    private HashMap<Integer,Alumno> alumnos;
    
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<Integer, Alumno>());
    }
    
    public Curso(String p_nombre, HashMap p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
        
    //setterand getters

    private void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }

    private void setAlumnos (HashMap <Integer, Alumno> p_alumnos) {
        this.alumnos= p_alumnos;
    }

    public String getNombre(){
        return this.nombre;
    }

    public HashMap getAlumnos(){
        return this.alumnos;
    }

    //metodos

    public void inscribirAlumno(Alumno p_alumno){
        
        this.getAlumnos().put(new Integer(p_alumno.getLu()), p_alumno);
    }
    
    public Alumno quitarAlumno(int p_lu){
        
     return (Alumno)this.getAlumnos().remove(new Integer(p_lu));
    }
    
    public int cantidadDeAlumnos(){
        this.getAlumnos().size();
    }
    
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(new Integer(p_lu));
    }
    
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    public Alumno buscarAlumno(int p_lu){
        return (Alumno)this.getAlumnos().get(new Integer (p_lu));
    }
    
    
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("Este el promedio: " + this.buscarAlumno(p_lu).promedio());
    }
    
    public void mostrarInscriptos(){
        for(Map.Entry<Integer, Alumno> alumnoInscripto: this.getAlumnos().entrySet()){
        System.out.println(alumnoInscripto.getValue().getLu() + " " + alumnoInscripto.getValue().nomYApe());  
        }
    }
 
}
