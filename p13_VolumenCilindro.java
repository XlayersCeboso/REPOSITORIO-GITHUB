// p12_VolumenCilindro

import java.util.Scanner;

public class p13_VolumenCilindro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double Volumen,Radio,Altura;

    System.out.println("Ingresa el valor del Radio: ");
    Radio = sc.nextDouble();

    System.out.println("Ingresa el valor de la Altura: ");
    Altura = sc.nextDouble();

    Volumen = Math.PI * ((Radio * Radio) * Altura);

    System.out.println("El volumen del Cilindro es: " + Volumen);
    }
}