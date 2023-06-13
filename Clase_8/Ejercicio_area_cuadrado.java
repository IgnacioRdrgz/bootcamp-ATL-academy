package Clase_8;

public class Ejercicio_area_cuadrado {
    public static void main (String[] args){

        float area = getAreaCuadrado( 10,  15);
        System.out.println(area);



    }

    private static float getAreaCuadrado(float x, float y){
        return x*y;
    }
}
