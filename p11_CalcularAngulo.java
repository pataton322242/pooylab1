import java.util.Scanner;

public class p11_CalcularAngulo{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Introduce el valor del primer ángulo: ");
        double angulo1 = scanner.nextDouble();

        System.out.print("Introduce el valor del segundo ángulo: ");
        double angulo2 = scanner.nextDouble();

        
        double angulo3 = 180 - (angulo1 + angulo2);

        
        System.out.println("El valor del tercer ángulo es: " + angulo3);
    }
}
