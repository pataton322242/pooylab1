package p120_Vehiculo;

public class Sedan extends Maquina implements Vehiculo, Familiar {

    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando....");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando....");

    }

    @Override
    public void reposar() {
        System.out.println("Reposando....");

    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna, es un Sedan");

    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema electrico, es un Sedan");

    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carrocería en tres partes, es un Sedan");

    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar Chasis Monocasco, es un Sedan");

    }

}