package maquinaria;

import maquinaria.Locomotoras;
import personal.Maquinistas;
import java.util.Scanner;

public class Trenes {

    Scanner sc = new Scanner(System.in);

    Locomotoras locomotora;
    Maquinistas responsable;
    public Vagones vagones[];

    public Trenes(Locomotoras locomotora, Maquinistas responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;
    }

    public class Vagones {

        int numId;
        double cargaMax;
        double cargaActual;
        String tipoMercancia;

        public Vagones(int numId, int cargaMax, int cargaActual, String tipoMercancia) {
            this.numId = numId;
            this.cargaMax = cargaMax;
            this.cargaActual = cargaActual;
            this.tipoMercancia = tipoMercancia;
        }

        public void setVagones() {
            System.out.println("Introduzca el número del vagón: ");
            numId = sc.nextInt();
            System.out.println("Introduzca la carga máxima: ");
            cargaMax = sc.nextDouble();
            System.out.println("Introduzca la carga actual: ");
            cargaActual = sc.nextDouble();
            System.out.println("Introduzca el tipo de mercancia: ");
            tipoMercancia = sc.nextLine();
        }
        
        public void info (){
            System.out.print("Número: " + numId);
            System.out.print("Carga máxima: " + cargaMax + "  ");
            System.out.print("Carga actual: " + cargaActual + "  ");
            System.out.println("Tipo de mercancía: " + tipoMercancia + "  ");
        }
    }

}
