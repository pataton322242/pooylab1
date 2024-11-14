import java.util.Scanner;
import java.util.InputMismatchException;

public class p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);
        int numNinos = 0;
        int cantidadDulces = 0;

        while (true) {
            try {
                System.out.print("Numero de niños en el barrio: ");
                numNinos = scanner.nextInt();
                System.out.print("Cantidad de dulces existente: ");
                cantidadDulces = scanner.nextInt();

                int dulcesPorNino = cantidadDulces / numNinos;
                System.out.println("A cada niño le tocan " + dulcesPorNino + " dulces.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Los niños y los dulces, deben ser cantidades numéricas.");
                scanner.next(); // Limpiar el buffer del scanner
            } catch (ArithmeticException e) {
                if (cantidadDulces == 0) {
                    System.out.println("Si no hay dulces, no puedo repartir dulces.");
                } else {
                    System.out.println("El número de niños no puede ser cero.");
                }
            }
        }

        scanner.close();
    }
}