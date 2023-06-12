package Clase_6;

import java.util.Scanner;

public class Mayor_menor {
    public static void main (String[] args) {

        System.out.println("Ingrese un numero");
        Scanner cargaNumero1 = new Scanner(System.in);
        Integer numero1 = cargaNumero1.nextInt();

        System.out.println("Ingrese un numero");
        Scanner cargaNumero2 = new Scanner(System.in);
        Integer numero2 = cargaNumero2.nextInt();

        System.out.println("Ingrese un numero");
        Scanner cargaNumero3 = new Scanner(System.in);
        Integer numero3 = cargaNumero3.nextInt();





        if (numero1 > numero2 & numero1 > numero3){
            System.out.println("El numero " + numero1 + " es el mas alto");

        } else if (numero2 > numero1 & numero2 > numero3) {
            System.out.println("El numero " + numero2 + " es el mas alto");

        }
        else{
            System.out.println("El numero " + numero3 + " es el mas alto");
        }


    if (numero1 < numero2 & numero1 < numero3){
        System.out.println("El numero " + numero1 + " es el mas bajo");

    } else if (numero2 < numero1 & numero2 < numero3) {
        System.out.println("El numero " + numero2 + " es el mas bajo");

    }
        else{
        System.out.println("El numero " + numero3 + " es el mas bajo");
    }

}

}
