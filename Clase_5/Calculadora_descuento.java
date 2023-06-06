package Clase_5;

import java.util.Scanner;

public class Calculadora_descuento {
    public static void main (String[] args){

        System.out.println("Por favor ingrese el precio original del producto");
        Scanner cargarPrecio = new Scanner(System.in);
        Integer precio = cargarPrecio.nextInt() ;
        System.out.println("Por favor ingrese el porcentaje de descuento a aplicar");
        Scanner cargarDescuento = new Scanner(System.in);
        Integer descuento = cargarDescuento.nextInt();


        System.out.println( "El precio final del producto con el descuento aplicado es: " + (precio - (precio * descuento / 100)));

    }

}
