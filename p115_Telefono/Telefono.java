package p115_Telefono;

public class Telefono implements Gps, Radio {

    public void obtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas ...");
    }

   
    public void detenerRadio() {
        System.out.println("Deteniendo radio ...");
    }

    public void iniciarRadio() {
        System.out.println("iniciando radio ...");
    }
}