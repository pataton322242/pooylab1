package p96_Empleado03;

public class Empleado03 {
    private String Nombre;
    private int edad;


    
    public Empleado03() {
    }


    public Empleado03(String nombre, int edad) {
        Nombre = nombre;
        this.edad = edad;
        
    }

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
