import java.util.Scanner;

public class p92_MayorMenor {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de elementos en el arreglo
        System.out.print("¿Cuántos números deseas ingresar? ");
        int n = scanner.nextInt();

        // Declarar e inicializar el arreglo de números enteros
        int[] numeros = new int[n];

        // Capturar los números
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los elementos del arreglo
        System.out.print("Números ingresados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Encontrar el número mayor y menor en el arreglo
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar el número mayor
        System.out.println("El número mayor es: " + mayor);

        // Mostrar el número menor
        System.out.println("El número menor es: " + menor);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

