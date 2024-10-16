package p94_Empleado01;

public class App {
public static void main(String[] args) {
    Empleado01 empleado1 = new Empleado01();
    Empleado01 empleado2 = new Empleado01();




    Empleado01 empleado3;
    empleado3 = new Empleado01();
    empleado3.Nombre = "el papu";
    empleado3.Edad = 15;

    empleado1.Nombre = "juan perez";
    empleado1.Edad = 25;
    empleado2.Nombre = "Maria lopez";
    empleado2.Edad = 30;
    
    
    
    System.out.println("empleado 1 nombre "+ empleado1.Nombre );
    System.out.println("empleado 1 edad "+ empleado1.Edad );
    System.out.println(empleado1.toString());
    System.out.println("empleado 2 nombre "+ empleado2.Nombre );
    System.out.println("empleado 2 edad "+ empleado2.Edad );
    System.out.println(empleado2.toString());
    System.out.println("\nEmpleado3");
    System.out.println(empleado3.toString());



    }
    
}
