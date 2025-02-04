package personal;

import java.util.Scanner;

public class Maquinistas {

    String nombre;
    String DNI;
    double sueldo;
    String rango;
    
    public Maquinistas (String nombre, String DNI, double sueldo, String rango){
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    
    public void info (){
        System.out.println("Maquinista: ");
        System.out.print("Nombre: " + nombre + "  ");
        System.out.print("DNI: " + DNI + "  ");
        System.out.print("Sueldo: " + sueldo + "  ");
        System.out.println("Rango: " + rango);
    }
}
