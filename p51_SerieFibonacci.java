import java.util.Scanner;

public class p51_SerieFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Introduce el número de términos de la serie de Fibonacci que deseas imprimir: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, introduce un número mayor que 0.");
                continue; 
            }

            int a = 0, b = 1; 
            int contador = 1; 

            System.out.print("Los primeros " + n + " números de la serie de Fibonacci son: ");
            
            while (contador <= n) {
                System.out.print(a + " ");
                int siguiente = a + b; 
                a = b; 
                b = siguiente;
                contador++; 
            }

            System.out.println(); 

            
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }
}
