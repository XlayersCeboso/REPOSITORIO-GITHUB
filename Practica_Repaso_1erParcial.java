/*Una empresa fotocopiadora requiere un programa que le permita llevar el control de su venta de
fotocopias. El valor de la copia es: Carta $3, Oficio $4, Doble Oficio $6, debe mostrarse un
resumen de ventas con un mensaje de acuerdo a la venta total:

Sebastián Guerra Hernández 3°A - Programación Orientada a Objetos I
*/

import java.util.Scanner;

public class Practica_Repaso_1erParcial {
    public static void main(String[] args) {

        //Limpia la pantalla 
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        //Las variables que se usarán a lo largo del programa 
        boolean repite = true;
        int ContadorVentas = 1;
        int CantidadCopias,PrecioSegunCopia = 0;
        String TipoDeCopia,resp;
        
        Scanner Sebas = new Scanner(System.in);

        //se inicializan las variables en ceros
        int CantidadCarta = 0, CantidadOficio = 0, CantidadDobleOficio = 0;
        int TotalCantidadCarta = 0, TotalCantidadOficio = 0, TotalCantidadDobleOficio = 0;
        
        //La cabecera del programa 
        System.out.println("-------------------------------");
        System.out.println("Papelería la Malena, SA. de CV. ");
        System.out.println("Sistema de ventas de copias ");
        System.out.println("-------------------------------");

        //Bucle principal 
        while (repite) {
            
            System.out.println("\nVenta " + ContadorVentas);
            System.out.print("Tipo de copia (C)arta $3, (O)ficio $4, (D)oble Oficio $6? "); 
            TipoDeCopia = Sebas.next().toUpperCase(); 
            //Se guarda el tipo de copia y se convierte a mayuscula


            //Según el tipo de copia se les asigna un valor
            switch (TipoDeCopia) {
                case "C":
                    PrecioSegunCopia = 3;
                    break;
                case "O":
                    PrecioSegunCopia = 4;
                    break;
                case "D":
                    PrecioSegunCopia = 6;
                    break;
                default:
                //Si se ingresa otro valor que no sea c, o, d se muestra un mensaje y se cierra el programa
                    System.out.println("\nPor favor ingresa un tipo de copia válido");
                    repite = false;
                    Sebas.close();
                System.exit(1); //cierra el programa inmediatamente 
            }

            System.out.print("Cantidad ? "); CantidadCopias = Sebas.nextInt();

            //Según el tipo de copia se actualizan los contadores para luego proceder con las operaciones
            switch (TipoDeCopia) {
                case "C":
                    CantidadCarta += CantidadCopias;
                    TotalCantidadCarta += CantidadCopias * PrecioSegunCopia;
                    break;
                case "O":
                    CantidadOficio += CantidadCopias;
                    TotalCantidadOficio += CantidadCopias * PrecioSegunCopia;
                    break;
                case "D":
                    CantidadDobleOficio += CantidadCopias;
                    TotalCantidadDobleOficio += CantidadCopias * PrecioSegunCopia;
                break;
            }

            //Se pregunta si se desea asignar otra venta 
            System.out.print("Otra venta (S/N) ? "); resp = Sebas.next().toUpperCase();
            repite = resp.equals("S");

            //Se suma 1 al Contador cada vez que el usuario desea agregar otra venta,
            //para que no aparezca siempre: "Venta 1"
            ContadorVentas++;
           
        }
        //Se procede a calcular los totales 
        int TotalVentas = (CantidadCarta + CantidadOficio + CantidadDobleOficio);
        int TotalMonto = (TotalCantidadCarta + TotalCantidadOficio + TotalCantidadDobleOficio);

        //Se muestran los resultados y algunos guiones medios para mejorar la presentación 
        System.out.println("-------------------------------");
        System.out.println("Resumen diario de ventas ");
        System.out.println("-------------------------------");
        System.out.println("\nVentas realizadas: " + (ContadorVentas - 1) );
        System.out.println("-------------------------------");
        System.out.println("Carta     : " + CantidadCarta + "  - $ " + TotalCantidadCarta);
        System.out.println("Oficio    : " + CantidadOficio + " - $ " + TotalCantidadOficio);
        System.out.println("Doble Of. : " + CantidadDobleOficio + "  - $ " + TotalCantidadDobleOficio);
        System.out.println("-------------------------------");
        System.out.println("Total Ventas: " + TotalVentas + " - $ " + TotalMonto);

        //Sirve para identificar los 3 tipos de ventas y mostrarlo según corresponda
        if ( TotalMonto < 50 ) {
            System.out.println("\nEsta venta es una venta: Venta moderada ");
        } else if (TotalMonto >= 50 && TotalMonto <= 100) {
            System.out.println("\nEsta venta es una venta: Venta frecuente ");
        } else if ( TotalMonto > 100) {
            System.out.println("\nEsta venta es una venta: Venta superada ");
        }
        Sebas.close();
    }
}