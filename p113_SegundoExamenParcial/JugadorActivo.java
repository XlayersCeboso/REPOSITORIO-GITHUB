package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        this.Partidos = partidos;
        this.Goles = goles;
    }

    public double getBono() {
        double bono = (getSalario() * 0.10) + (Partidos * 50) + (Goles * 5);
        Total = getSalario() + bono;
        return bono;
    }

    public String toString() {
    return super.toString() + ", Partidos = " + Partidos + ", Goles = " + Goles + ", Bono = " + getBono();
    }
}