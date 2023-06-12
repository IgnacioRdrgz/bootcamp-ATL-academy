package Clase_6;

import java.util.Scanner;

public class Promedio_3numeros {
    public static void main (String[] args) {

        System.out.println("Ingrese un numero");
        Scanner cargaNumero1 = new Scanner(System.in);
        double numero1 = cargaNumero1.nextInt();

        System.out.println("Ingrese un numero");
        Scanner cargaNumero2 = new Scanner(System.in);
        double numero2 = cargaNumero2.nextInt();

        System.out.println("Ingrese un numero");
        Scanner cargaNumero3 = new Scanner(System.in);
        double numero3 = cargaNumero3.nextInt();
        double total = numero1 + numero2 + numero3;
        double promedio = total/3;
        System.out.println("El promedio de los 3 numeros es " + promedio);
    }



}
