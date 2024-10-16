package Persona;

public class Persona {

    protected String Nombre ;
    protected String Direccion;
    protected int Edad;

    public Persona(String nombre, String direccion) {
        Nombre = nombre;
        Direccion = direccion;



    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    
}
