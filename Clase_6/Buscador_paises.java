package Clase_6;

import java.util.Scanner;

public class Buscador_paises {
    public static void main(String[] args){
        System.out.println("Ingrese el nombre de un pais por favor:");
        Scanner cargarPais = new Scanner(System.in);
        String nombrePais = cargarPais.next();

        System.out.println("https://www.google.com/maps/search/" + nombrePais);
    }
}
