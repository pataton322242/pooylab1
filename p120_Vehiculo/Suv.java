package p120_Vehiculo;

public class Suv extends Maquina implements Vehiculo, TodoTerreno {

    public Suv(String nombre, String propietario, int pasajeros) {
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
        System.out.println("Es un automovil  con combustion interna, es un Suv");

    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema electrico, es un Suv");

    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automóvil con chasis independiente, es un Suv");

    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un automóvil con traccion 4x4, es un Suv");

    }

}