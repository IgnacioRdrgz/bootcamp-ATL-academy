package Clase_6;

import java.util.Scanner;

public class Par_impar {
    public static void main (String[] args){
        System.out.println("Ingrese un numero");
        Scanner cargaNumero = new Scanner(System.in);
        double numero = cargaNumero.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }

    }
}
