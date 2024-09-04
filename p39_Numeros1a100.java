import java.util.Scanner;

public class p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Imprimiendo los numeros de 0 a n");
        System.out.println("Hasta donde ?");
        int n = new Scanner(System.in).nextInt();
        System.out.println("En cuanto de incremento?");
        int i = new Scanner(System.in).nextInt();
        int c;
        c = 0;
        while (c <= n) {
            System.out.printf("chilaquil %d\n ", c);
            c = c + i;
        }
        System.out.println("\nProceso terminado ...");
    }
}