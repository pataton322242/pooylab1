
import java.util.Random;
public class p88_Aleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a1 = rnd.nextInt();
        int a2 = rnd.nextInt(30) + 1;
        int min = 50;
        int max = 60;
        int a3 = rnd.nextInt(max - min +1 ) + min;
        System.out.print("\033[H\033[2J");
        System.out.print("Numero entero aleatorio positivo:" + Math.abs(a1));
        System.out.print("Numero entero aleatorio 1..30:" + Math.abs(a2));
        System.out.print("Numero entero aleatorio 1..30:" + Math.abs(a3));
    }




    
}
