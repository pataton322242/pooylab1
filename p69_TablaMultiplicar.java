import java.util.Scanner;

public class p69_TablaMultiplicar {

    public static void Tabla(int tabla, int limite) {
        for(int i = 1; i<=limite; i++) {
            System.out.printf("%d x %d = %d \n", tabla, i, tabla * i);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner Sebas = new Scanner(System.in);

        System.out.println("Que tabla quieres ? "); int tabla = Sebas.nextInt();
        System.out.println("Hasta dónde       ? "); int limite = Sebas.nextInt();

        Tabla(tabla, limite);
        
    }
}