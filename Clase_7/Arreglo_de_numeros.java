package Clase_7;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglo_de_numeros {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para indicar el tamaño del arreglo");
        Scanner cargaTamaño = new Scanner(System.in);
        Integer tamaño = cargaTamaño.nextInt();

    double [] numeros = new double[tamaño];
    double suma = 0;
    Scanner cargaNumero = new Scanner(System.in);
//carga y suma del total de los numeros del arreglo.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero");
            int numero = cargaNumero.nextInt();
            numeros[i] = numero;
            suma += numeros[i];

        }
//muestra por pantalla los numeros del arreglo.
        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");


        }
//saco el mayor y el menor del arreglo
        System.out.println(" ");
        double max = 0;
        double min = 0;

        for (int i = 0; i < numeros.length; i++){
            double num = numeros[i];
            if(num <= min || i == 0 ){
                min = num;


            }
            if(num >= max || i == 0){
                max = num;
            }

        }
//imprimo por pantalla el maximo, el minimo y el promedio.
        System.out.println("El numero mas chico es el " + min + " y el mas grande es el " + max);
        System.out.println("El promedio de la suma de los numeros del arreglo es " + suma/numeros.length);


    }}

