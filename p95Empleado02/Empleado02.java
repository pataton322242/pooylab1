package p95Empleado02;

public class Empleado02 {
    private String Nombre;
    private int edad;
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Empleado02 [Nombre=" + Nombre + ", edad=" + edad + "]";
    }
    

    
}
