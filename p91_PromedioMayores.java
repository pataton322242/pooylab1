import java.util.Scanner;

public class p91_PromedioMayores {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de calificaciones
        System.out.print("¿Cuántas calificaciones deseas ingresar? ");
        int n = scanner.nextInt();

        // Declarar e inicializar el arreglo de calificaciones
        float[] calificaciones = new float[n];

        // Capturar las calificaciones
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        // Mostrar los elementos del arreglo
        System.out.print("Calificaciones ingresadas: ");
        for (float cal : calificaciones) {
            System.out.print(cal + " ");
        }
        System.out.println();

        // Calcular la suma y el promedio
        float suma = 0;
        for (float cal : calificaciones) {
            suma += cal;
        }
        float promedio = suma / n;

        // Mostrar la suma y el promedio
        System.out.println("Suma de las calificaciones: " + suma);
        System.out.println("Promedio de las calificaciones: " + promedio);

        // Mostrar solo los elementos mayores al promedio y contarlos
        int contadorMayores = 0;
        System.out.print("Calificaciones mayores al promedio: ");
        for (float cal : calificaciones) {
            if (cal > promedio) {
                System.out.print(cal + " ");
                contadorMayores++;
            }
        }
        System.out.println();

        // Mostrar el número de elementos mayores al promedio
        System.out.println("Número de calificaciones mayores al promedio: " + contadorMayores);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
