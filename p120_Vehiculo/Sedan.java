package p120_Vehiculo;

public class Sedan extends Maquina implements Familiar{

    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carrocería en tres partes es un Sedan ");        
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan ");  
        
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna es un Sedan ");  
        
    }

    @Override
    public void sistemElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es un Sedan ");  
        
    }
}