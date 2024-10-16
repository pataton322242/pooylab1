       
       
import java.util.Scanner;

public class p72_SumaDigitos {
    public static long SumaDigitos(long n) {
        long suma = 0, digito;
        while( n != 0){
            digito = n % 10;
            suma += digito;
            n = n / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner Sebas = new Scanner(System.in);
        long numero;

        System.out.print("\033[H\033[2J");
        System.out.print("Dame un numero entero y sumaré sus digitos ? ");
        numero = Sebas.nextLong();
        System.out.println("\nSuma digitos: "+ SumaDigitos(numero));
        
    }
}