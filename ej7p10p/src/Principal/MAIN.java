package Principal;

import java.util.Arrays;
import java.util.Scanner;
import maquinaria.Locomotoras;
import maquinaria.Trenes;
import personal.JefesDeEstación;
import personal.Maquinistas;
import personal.Mecánicos;

public class MAIN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del mecánico: ");
        String nombree = sc.nextLine();

        System.out.println("Introduzca el telefono del mecanico");
        int telefonoo = sc.nextInt();

        Mecánicos mecanico = new Mecánicos(nombree, telefonoo);

        System.out.println("Introduzca la especialidad del mecánico, elija una de las siguientes: ");
        System.out.println("- frenos");
        System.out.println("- hidráulica");
        System.out.println("- electricidad");
        System.out.println("- motor");
        String especialidadd = sc.nextLine();

        mecanico.setEspecialidad(especialidadd);

        System.out.println("Introduzca la matrícula de la locomotora: ");
        String matricula = sc.nextLine();

        System.out.println("Introduzca la potencia de la locomotora: ");
        int potencia = sc.nextInt();

        System.out.println("Introduzca el año de fabricación de la locomotora: ");
        int añoFabricacion = sc.nextInt();
        sc.nextLine();

        Locomotoras locomotora = new Locomotoras(matricula, potencia, añoFabricacion, mecanico);

        System.out.println("Introduzca el nombre del maquinista: ");
        String nombreMaquinista = sc.nextLine();

        System.out.println("Introduzca el DNI del maquinista: ");
        String DNIMaquinista = sc.nextLine();

        System.out.println("Introduzca el sueldo del maquinista: ");
        double sueldoMaquinista = sc.nextDouble();
        sc.nextLine();

        System.out.println("Introduzca el rango del maquinista");
        String rango = sc.nextLine();

        Maquinistas maquinista = new Maquinistas(nombreMaquinista, DNIMaquinista, sueldoMaquinista, rango);

        Trenes tren = new Trenes(locomotora, maquinista);

        System.out.println("Introduzca el nombre del jefe de la estacion: ");
        String nombreJefe = sc.nextLine();

        System.out.println("Introduzca eñ DNI del jefe de la estacion: ");
        String DNIJefe = sc.nextLine();

        System.out.println("Introduzca la fecha de nombramiento del jefe de la estacion: ");
        String fechaNombramientoJefe = sc.nextLine();

        JefesDeEstación jefe = new JefesDeEstación(nombreJefe, DNIJefe, fechaNombramientoJefe);

        System.out.println("¿Cuantos vagones desea introducir?");
        int cant = sc.nextInt();

        if (cant > 5) {
            do {
                System.out.println("Ha introducido mas vagones de los permitidos, el máximo es 5");
                cant = sc.nextInt();
            } while (cant > 5);
        }

       Trenes.Vagones vagones [] = new Trenes.Vagones [cant];
       tren.vagones = vagones;
       
       for (int i = 0; i < vagones.length; i++){
           vagones[i].setVagones();
       }
       
       
        
        
       /*Crear metodo en trenes para añadir vagones en una variable de tipo ARRAY*/
       /*for (int i = 0; i < cant; i++) {
            System.out.println("Introduzca el número identificador del vagón: ");
            int num = sc.nextInt();
            System.out.println("Introduzca la carga maxima del vagón: ");
            int cargaMax = sc.nextInt();
            System.out.println("Introduzca la carga actual del vagón: ");
            int cargaActual = sc.nextInt();
            System.out.println("Introduzca el tipo de mercancia del vagon");
            String tipoMercancia = sc.nextLine();
            Trenes.Vagones vagon = new Trenes.Vagones(num, cargaMax, cargaActual, tipoMercancia);
        }*/
       
       jefe.info();
       locomotora.info();
       maquinista.info();
       System.out.println("Vagones: ");
       
       for (int i = 0; i < cant; i++){
           vagones[i].info();
       }

    }

}
