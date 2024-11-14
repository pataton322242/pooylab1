package p120_Vehiculo;

public abstract class Maquina {
    private String marca;
    private String propietario;
    private int pasajeros;

    public Maquina(String marca, String propietario, int pasajeros) {
        this.marca = marca;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    public abstract void reposar();

    public abstract void arrancar();

    public abstract void frenar();

    @Override
    public String toString() {
        return "Maquina [marca=" + marca + ", propietario=" + propietario + ", pasajeros=" + pasajeros + "]";
    }

}