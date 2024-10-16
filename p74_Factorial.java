import java.util.Scanner;

public class p74_Factorial {

    public static double Factorial(int n){
        double f = 1;
        for(int i=1; i<=n; i++)
            f = f * i;
        return f;
    }
    public static void main(String[] args) {
        Scanner Sebas = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Dame un numero entero y te regreso el factorial");
        int n = Sebas.nextInt();

        System.out.println("\nEl factorial es: "+ Factorial(n));
        
        
    }
}
