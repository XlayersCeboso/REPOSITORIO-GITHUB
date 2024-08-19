// p10_HipotenusaTriangulo

import java.util.Scanner;

public class p10_HipotenusaTriangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double LongitudLado1,LongitudLado2,Hipotenusa;

    System.out.println("Ingresa el valor de la longitud 1: ");
    LongitudLado1 = sc.nextDouble();


    System.out.println("Ingresa el valor de la longitud 2: ");
    LongitudLado2 = sc.nextDouble();

    Hipotenusa = Math.sqrt( LongitudLado1 * LongitudLado1 + LongitudLado2 * LongitudLado2 );

    System.out.println("El valor de la hipotenusa es: " + Hipotenusa);
    }
}
