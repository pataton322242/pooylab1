        import java.util.Random;

public class p93_ParesImpares {
    public static void main(String[] args) {
        // Definir la constante MAX
        final int MAX = 100;

        // Declarar los dos arreglos de tamaño MAX
        int[] a = new int[MAX];
        int[] b = new int[MAX];

        // Crear un objeto Random para generar números aleatorios
        Random rand = new Random();

        // Rellenar el arreglo a[] con números aleatorios entre 0 y 20
        for (int i = 0; i < MAX; i++) {
            a[i] = rand.nextInt(21); // Genera un número aleatorio entre 0 y 20
        }

        // Mostrar los elementos del arreglo a[]
        System.out.print("Elementos del arreglo a[]: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Inicializar contadores de pares e impares
        int contadorPares = 0;
        int contadorImpares = 0;

        // Mostrar los elementos que son pares y contarlos
        System.out.print("Elementos pares: ");
        for (int num : a) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                contadorPares++;
            }
        }
        System.out.println();

        // Mostrar los elementos que son impares y contarlos
        System.out.print("Elementos impares: ");
        for (int num : a) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                contadorImpares++;
            }
        }
        System.out.println();

        // Mostrar la cuenta de pares
        System.out.println("Cantidad de números pares: " + contadorPares);

        // Mostrar la cuenta de impares
        System.out.println("Cantidad de números impares: " + contadorImpares);
    }
}


