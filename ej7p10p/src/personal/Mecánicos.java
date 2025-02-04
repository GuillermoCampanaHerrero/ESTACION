package personal;

import java.util.Scanner;

public class Mecánicos {

    Scanner sc = new Scanner(System.in);

    public String nombre;
    int telefono;
    private String especialidad;
    
    public Mecánicos(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setEspecialidad(String especialidad) {
        boolean valor;
        do {
            if (especialidad.equals("frenos") == true || especialidad.equals("hidráulica") == true  || especialidad.equals("electricidad") == true  || especialidad.equals("motor") == true ) {
                this.especialidad = especialidad;
                valor = true;
            } else {
                System.out.println("Introduzca una especialidad válida");
                especialidad = sc.nextLine();
                valor = false;
            }
        } while (valor = true);
    }
}
