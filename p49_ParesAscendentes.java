import java.util.Scanner;

public class p49_ParesAscendentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Introduce un número positivo menor o igual a 100: ");
            int n = scanner.nextInt();

            if (n > 100 || n < 0) {
                System.out.println("Por favor, introduce un número positivo menor o igual a 100.");
                continue;
            }

            int suma = 0;
            int contador = 0;

            System.out.print("Números pares entre 100 y " + n + ": ");
            for (int i = 100; i >= n; i -= 2) {
                System.out.print(i + " ");
                suma += i;
                contador++;
            }

            double promedio = (contador != 0) ? (double) suma / contador : 0;
            System.out.println("\nLa suma: " + suma);
            System.out.printf("El promedio: %.2f\n", promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }
}

