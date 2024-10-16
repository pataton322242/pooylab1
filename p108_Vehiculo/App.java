package p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
            System.out.flush();

        Vehiculo[] flota = new Vehiculo[3];
        
        
        flota[0] = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        flota[1] = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);
        flota[2] = new Camioneta("CA104014545", "Dina",2020,100000.5,500.0,4);


        
        System.out.println("Datos de los Vehiculos de la flota");
        for (Vehiculo vehiculo : flota) {
            System.out.println(vehiculo.toString());
        }

    
        System.out.println("\nCalculando el total de precio de todos los vehículos ...");
        double totalPrecio = 0.0;
        for (Vehiculo vehiculo : flota) {
            System.out.println(vehiculo.getPrecio());
            totalPrecio += vehiculo.getPrecio();
        }

        System.out.println("La suma de precios es: " + totalPrecio);
    }
}



