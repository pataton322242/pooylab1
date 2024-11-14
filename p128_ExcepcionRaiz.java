import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);
        boolean calculoExitoso = false;

        while (!calculoExitoso) {
            System.out.print("Introduce un número: ");
            try {
                double numero = scanner.nextDouble();
                if (numero < 0) {
                    System.out.println("El número no puede ser negativo.");
                } else {
                    double raizCuadrada = Math.sqrt(numero);
                    System.out.printf("El resultado es: %.2f\n", raizCuadrada);
                }
            } catch (Exception e) {
                System.out.println("Error, no puedo calcular la raíz cuadrada.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}