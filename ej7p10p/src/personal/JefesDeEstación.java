package personal;

import java.util.Scanner;

public class JefesDeEstación {

    String nombre;
    String DNI;
    String fechaNombramiento;
    
    public JefesDeEstación (String nombre, String DNI, String fechaNombramiento){
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombramiento = fechaNombramiento;
    }
    
    public void info (){
        System.out.println("Jefe de Estación: ");
        System.out.print("Nombre: " + nombre + "  ");
        System.out.print("DNI: " + DNI + "  ");
        System.out.println("Fecha de Nombramiento: " + fechaNombramiento);
    }
}
