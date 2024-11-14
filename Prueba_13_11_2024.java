import java.util.Scanner;


public class Prueba_13_11_2024 {
    public static void main(String[] args) {
        Scanner Sebas = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.print("Por favor ingresa el primer valor: "); int a = Sebas.nextInt();
        System.out.print("Por favor ingresa el segundo valor: "); int b = Sebas.nextInt();

        int multiplicación = a * b;
        System.out.println(a + " x " + b + " = " + multiplicación);

        Sebas.close();
    }

}
