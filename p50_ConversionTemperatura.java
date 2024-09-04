import java.util.Scanner;

public class p50_ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Introduce la temperatura inicial en grados centígrados: ");
            int temperaturaInicial = scanner.nextInt();

            System.out.print("Introduce la temperatura final en grados centígrados: ");
            int temperaturaFinal = scanner.nextInt();

            if (temperaturaFinal < temperaturaInicial) {
                System.out.println("Error: La temperatura final no puede ser menor que la temperatura inicial.");
                continue;  
            }

            System.out.println("Conversión de grados centígrados a Fahrenheit:");
            
            for (int i = temperaturaInicial; i <= temperaturaFinal; i++) {
                double fahrenheit = (i * 9.0 / 5) + 32;  
                System.out.printf("%d°C = %.2f°F\n", i, fahrenheit);
            }
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }
}
