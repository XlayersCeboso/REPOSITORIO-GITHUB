package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        this.Subordinados = subordinados;
        this.Proyectos = proyectos;
    }

    public double getBono() {
        double bono = (getSalario() * 0.15) + (Proyectos * 100) + (Subordinados * 10);
        Total = getSalario() + bono; 
        return bono;
    }

    public String toString() {
        return super.toString() + ", Subordinados = " + Subordinados + ", Proyectos = " + Proyectos + ", Bono = " + getBono();
    }
}