import java.util.Scanner;

public class p40_Numeros100a1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Imprimiendo numeros ");
        System.out.println("Desde donde deseas descender ?");
        int c = new Scanner(System.in).nextInt();
        System.out.println("En cuanto deseas decrementar ?");
        int d = new Scanner(System.in).nextInt();

        while (c >= 1) {
            System.out.printf("Cheve %d \n", c);
            c = c - d;
        }
        System.out.println("\nProceso terminado ...");
    }
}