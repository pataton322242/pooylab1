import java.util.Scanner;

public class p15_ConversionADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad en pesos: ");
        double cantidadPesos = scanner.nextDouble();
        System.out.print("Ingresa la cotización del dólar: ");
        double cotizacionDolar = scanner.nextDouble();
        double cantidadDolares = cantidadPesos / cotizacionDolar;
        System.out.println("El equivalente en dólares es: " + cantidadDolares);
        
        
    }
}

