package maquinaria;

import personal.Mecánicos;
import java.util.Scanner;

public class Locomotoras {
    String matricula;
    int potencia;
    int añoFabricacion;
    Mecánicos responsable;
    
    public Locomotoras (String matricula, int potencia, int añoFabricacion, Mecánicos responsable){
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.responsable = responsable;
    }
    
    public void info (){
        System.out.println("Locomotora:");
        System.out.print("Matrícula: " + matricula + "  ");
        System.out.print("Potencia: " + potencia + "  ");
        System.out.print("Año de fabricación: " + añoFabricacion + "  ");
        System.out.println("Mecánico asignado: " + responsable.nombre);
    }
    
}
