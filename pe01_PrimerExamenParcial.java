// Primer exámen parcial - Sebastián Guerra Hernández 3°A

import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        int TotalAlumnos = 0, TotalDocentes = 0, TotalTrabajadores = 0;
        int TotalHombres = 0, TotalMujeres = 0, Totales = 0;
        int DineroAlumnos = 0, DineroDocentes = 0, DineroTrabajadores = 0;
        int TotalEdad = 0, TotalRechazados = 0;
        double PromedioEdad;
        boolean repite = true;
        String resp;
        int DineroTodo, CostoInscripcion =0;
        Scanner Sebas = new Scanner(System.in);

        while (repite) {
            System.out.println("Cuál es tu nombre?");
            String Nombre = Sebas.nextLine();

            System.out.println("Qiubo " + Nombre + " Cuál es tu edad?");
            int Edad = Sebas.nextInt();
            Sebas.nextLine();

            if (Edad < 23) {
                TotalRechazados++;
                System.out.println("Debes er mayor de 22 para ingresar ");
            } else {
                Totales++;
                TotalEdad += Edad;

                System.out.print("Por favor, ingresa tu sexo: [H]ombre o [M]ujer\n");
                char Sexo = Character.toUpperCase(Sebas.next().charAt(0));
                Sebas.nextLine();

                if (Sexo == 'H') {
                    TotalHombres++;
                } else if (Sexo == 'M') {
                    TotalMujeres++;
                }

                System.out.println("Ingresa el tipo de trabajador que eres: [A]lumno, [D]ocente o [T]rabajador");
                char TipoParticipante = Character.toUpperCase(Sebas.next().charAt(0));
                Sebas.nextLine();

                CostoInscripcion = 0;

                switch (TipoParticipante) {
                    case 'A':
                        TotalAlumnos++;
                        CostoInscripcion = 40; DineroAlumnos += CostoInscripcion;
                        break;
                    case 'D':
                        TotalDocentes++;
                        CostoInscripcion = 60; DineroDocentes += CostoInscripcion;
                        break;
                    case 'T':
                        TotalTrabajadores++;
                        CostoInscripcion = 80; DineroTrabajadores += CostoInscripcion;
                        break;
                    default:
                        System.out.println("Ingresa un tipo de trabajadr válido ");
                    continue;
                }
            }

            System.out.print("De neuvo (S/N) ? ");
            resp = Sebas.nextLine().toUpperCase();
            repite = resp.equals("S");
        }

        DineroTodo = DineroAlumnos + DineroDocentes + DineroTrabajadores;
        PromedioEdad = Totales > 0 ? (double) TotalEdad / Totales : 0;

        System.out.println("-------------------------------");
        System.out.println("Total Alumnos: " + TotalAlumnos);
        System.out.println("Total Docentes: " + TotalDocentes);
        System.out.println("Total Trabajadores: " + TotalTrabajadores);
        System.out.println("Total Hombres: " + TotalHombres);
        System.out.println("Total Mujeres: " + TotalMujeres);
        System.out.println("Total Participantes: " + Totales);
        System.out.println("Total Rechazados: " + TotalRechazados);
        System.out.println("Edades " + PromedioEdad);
        System.out.println("Dinero Alumnos: " + DineroAlumnos);
        System.out.println("Dinero Docentes: " + DineroDocentes);
        System.out.println("Dinero Trabajadores: " + DineroTrabajadores);
        System.out.println("Total Dinero General: " + DineroTodo);

        if (DineroTodo < 50) {
            System.out.println("El evento concluye con ganancias BAJAS ");
        } else if (DineroTodo >= 50 && DineroTodo <= 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS ");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias ");
        }
        Sebas.close();
    }
}