package p139_ArchivoEstudiante;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Procesa {
    public static void capturarDatos(ArrayList <Estudiante> datos) {
        Scanner Sebas = new Scanner(System.in);
        System.out.println("Introduce los datos de una Estudiante (nombre vacío para terminar )");
        while (true) {
            Estudiante Estudiante = new Estudiante();
            System.out.print("Dato del Estudiante > ");
            System.out.print("\nNombre: "); Estudiante.setNombre( Sebas.nextLine() );
            if (Estudiante.getNombre().isEmpty() ) break;
            System.out.print("Edad: "); Estudiante.setEdad( Sebas.nextInt() );
            System.out.print("Promedio: "); Estudiante.setPromedio( Sebas.nextFloat() ); Sebas.nextLine();
            System.out.print("Sexo [H]ombre - [M]ujer: ");//////////////////set.sexo(0);
            datos.add(Estudiante);
        }
    }
    public static void  mostrarDatos(ArrayList <Estudiante> datos ) {
        System.out.println("Los datos hasta el momento son: ");
        for (Estudiante Estudiante : datos) {
            System.out.println(Estudiante);
        }
    }
    public static void grabarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }
    public static ArrayList<Estudiante> leerDatos (String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream (new FileInputStream(archivo));
        datos = (ArrayList <Estudiante>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
}
