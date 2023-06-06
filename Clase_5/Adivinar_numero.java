package Clase_5;

import java.util.Scanner;

public class Adivinar_numero {
    public static void main (String[] args){

        System.out.println("Ingrese un numero del 1 al 100");
        Scanner cargaNumero = new Scanner(System.in);
        Integer numero = cargaNumero.nextInt();

        Integer numeroAleatorio = (int) (Math.random() * 99) + 1;

        if(numeroAleatorio == numero) {
            System.out.println("Acertaste!! la probabilidad está de tu lado");
        }

          else {
                System.out.println("No acertaste, mejor surte para la proxima, el numero era " + numeroAleatorio);


          }


    }

}
