package Clase_5;

import java.util.Scanner;

public class Conversor_millas_kilometros {
    public static void main (String[] args){

        System.out.println("Ingrese una distancia en millas para ser convertida a Km");
        Scanner cargarMillas = new Scanner(System.in);
        Integer millas = cargarMillas.nextInt() ;

        System.out.println( millas + " millas son: " + millas * 1.60934 + "kilometros");

    }

}
