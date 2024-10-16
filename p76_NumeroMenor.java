import java.util.Scanner;

public class p76_NumeroMenor {

    public static int Menor(int n1, int n2, int n3, int n4) {
        int men = -1;

        if(n1 < n2 && n1 < n3 && n1 < n4)      men = n1;
        else if(n2 < n1 && n2 < n3 && n2 < n4) men = n2;
        else if(n3 < n1 && n3 < n2 && n3 < n4) men = n3;
        else if(n4 < n1 && n4 < n2 && n4 < n3) men = n4;
        return men;
    }

    public static void main(String[] args) {
        int n1, n2, n3, n4, res;
        Scanner Sebas = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Ingresa los 4 números ");
        n1 = Sebas.nextInt(); n2 = Sebas.nextInt(); n3 = Sebas.nextInt(); n4 = Sebas.nextInt();

        res = Menor(n1, n2, n3, n4);
        if (!(res == -1)) 
            System.out.println("\nEl menor de los 4 números es " + res);
        else
            System.out.println("\nNo hay un número menor en los números que introdujiste ");
        
    }
}
