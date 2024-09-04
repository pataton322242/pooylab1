import java.util.Scanner;

public class p48_Imparesascendentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Introduce un número positivo: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, introduce un número positivo.");
                continue;
            }

            int i = 1;  // Primer número impar
            int suma = 0;
            int contador = 0;

            System.out.print("Números impares entre 1 y " + n + ": ");
            while (i <= n) {
                System.out.print(i + " ");
                suma += i;
                contador++;
                i += 2;  // Incrementar en 2 para obtener el siguiente impar
            }

            double promedio = (double) suma / contador;
            System.out.println("\nLa suma: " + suma);
            System.out.printf("El promedio: %.2f\n", promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }
}
