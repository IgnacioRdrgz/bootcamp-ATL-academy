package Clase_5;

import java.util.Scanner;

public class Calculadora_de_propina {
    public static void main (String[] args){

        System.out.println("Por favor ingrese el total de la cuenta del restaurante: ");
        Scanner cargarTotalCuenta = new Scanner(System.in);
        Integer cuenta = cargarTotalCuenta.nextInt() ;
        System.out.println("Por favor ingrese el porcentaje de propina");
        Scanner cargarPropina = new Scanner(System.in);
        Integer propina = cargarPropina.nextInt();


        System.out.println( "La propina calculada segun el total de la cuanta es de : " + (cuenta * propina / 100));

    }
}
