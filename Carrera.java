import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Write a description of class Carrera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *5.1. En la clase ejecutable se debe:

5.1.1. Crear una instancia de Curso y varias de la clase Alumno
5.1.2. Asignarles notas de parciales a los alumnos
5.1.3. Inscribir los alumnos al curso creado anteriormente.
5.1.4. Imprimir la cantidad y la lista de alumnos inscriptos al curso
5.1.5. Dar de baja un alumno del curso, y luego verificar que no esté inscripto
5.1.6. Imprimir nuevamente la lista de alumnos para ver como que queda definitivamente y la cantidad total de
alumnos inscriptos en el curso
5.1.7. Buscar un alumno por su libreta. Una vez encontrado, mostrarlo con el método apropiado.
5.1.8. Mostrar el promedio del alumno solicitado, según libreta
 */

public class Carrera {
    public static void main(String args []) {
        // 5.1.1
        Alumno a1 = new Alumno(111, "Pedro", "Gomez");
        Alumno a2 = new Alumno(222, "Maria", "Vasquez");
        Alumno a3 = new Alumno(333, "Juan", "Perez");
        Alumno a4 = new Alumno(444, "Marcela", "Martinez");
        HashMap<Integer, Alumno> alumnos = new HashMap<Integer, Alumno>();
        Curso curso = new Curso("Curso 1", alumnos);
    
        // 5.1.2
        a1.setNota1(6);
        a1.setNota2(8);
        a2.setNota1(4);
        a2.setNota2(9);
        a3.setNota1(7);
        a3.setNota2(6);
        a4.setNota1(10);
        a4.setNota2(8);
    
        // 5.1.3
        curso.inscribirAlumno(a1);
        curso.inscribirAlumno(a2);
        curso.inscribirAlumno(a3);
        curso.inscribirAlumno(a4);
    
        // 5.1.4
        System.out.println(curso.cantidadDeAlumnos());
        curso.mostrarInscriptos();
    
        // 5.1.5
        curso.estaInscripto(curso.quitarAlumno(222));
    
        // 5.1.6
        System.out.println(curso.cantidadDeAlumnos());
        curso.mostrarInscriptos();
    
        // 5.1.7
        curso.buscarAlumno(333).mostrar();
    
        // 5.1.8
        System.out.println(curso.buscarAlumno(444).promedio());
    }
}