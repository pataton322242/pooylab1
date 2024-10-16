package p95Empleado02;

public class App {
    public static void main(String[] args) {
        Empleado02 empleado1 = new Empleado02();
        Empleado02 empleado2 = new Empleado02();

        empleado1.setNombre("Carlos");
        empleado1.setEdad(44);
        empleado2.setNombre("maria");
        empleado2.setEdad(25);


        System.out.println("empeleado 1 nombre " + empleado1.getNombre());
        System.out.println("empleado 1 edad " + empleado1.getEdad());
        System.out.println(empleado1.toString());
        System.out.println("empleado 2 nombre " + empleado2.getNombre());
        System.out.println("empleado 2 edad " + empleado2.getEdad());
        System.out.println(empleado2.toString());

    }
    
}
