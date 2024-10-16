package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        Jugadores = new ArrayList<>();
        Nombre = nombre;
        Liga = liga;
    }
    
    public ArrayList <Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono(); 
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.getSalario(); 
        }
        return total;
    }

    public int getTotalH() {
        int TodosHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getGenero() == 'H') {  
                TodosHombres ++;
            }
        }
        return TodosHombres;
    }

    public int getTotalM() {
        int TodasMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getGenero() == 'M') {  
                TodasMujeres ++;
            }
        }
        return TodasMujeres;
    }

    public void reporte() {
        System.out.println(this);  
        for (Jugador jugador : Jugadores) {
            System.out.println("> " + jugador);
        }
    }

    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size()  + "getTotalBono()=" + getTotalBono() + ", getTotal()=" + getTotal() + ", getTotalH()=" + getTotalH() + ", getTotalM()=" + getTotalM() + "]";
    }
}