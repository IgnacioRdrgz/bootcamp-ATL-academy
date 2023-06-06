package Clase_5;
import java.util.Scanner;

public class Calculadora_de_edad_de_perros {
    public static void main (String[] args){

        System.out.println("Ingrese la edad de su perro");
        Scanner cargaEdadPerro = new Scanner(System.in);
        Integer Edad = cargaEdadPerro.nextInt() ;

        System.out.println("La edad actual de su perro es: " + Edad * 7);

    }
}
