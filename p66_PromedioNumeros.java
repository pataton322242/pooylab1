import java.util.Scanner;

public class p66_PromedioNumeros {
public static float promedio(float n1, float n2, float n3) {
float suma, prom;
suma = n1 + n2 + n3;
prom = suma /3;
return prom;
}

    public static void main(String[] args) {
        float n1, n2, n3, prom;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Dame número 1 : ");
        n1 = obj.nextFloat();
        System.out.print("Dame número 2 : ");
        n2 = obj.nextFloat();
        System.out.print("Dame número 3 : ");
        n3 = obj.nextFloat();
        prom = promedio(n1, n2, n3);
        System.out.printf("\nEl promedio es %.2f", prom);
    }

}
