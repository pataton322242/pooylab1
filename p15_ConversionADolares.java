import java.util.Scanner;

public class p15_ConversionADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos la cantidad en pesos
        System.out.print("Ingresa la cantidad en pesos: ");
        double cantidadPesos = scanner.nextDouble();
        
        // Pedimos la cotización del dólar
        System.out.print("Ingresa la cotización del dólar: ");
        double cotizacionDolar = scanner.nextDouble();
        
        // Calculamos el equivalente en dólares
        double cantidadDolares = cantidadPesos / cotizacionDolar;
        
        // Mostramos el resultado
        System.out.println("El equivalente en dólares es: " + cantidadDolares);
        
        
    }
}

