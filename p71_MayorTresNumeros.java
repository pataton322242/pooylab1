import java.util.Scanner;

public class p71_MayorTresNumeros {

    public static float Mayor(float n1, float n2, float n3) {
        float may = -1;

        if(n1 > n2 && n1 > n3)      may = n1;
        else if(n2 > n1 && n2 > n3) may = n2;
        else if(n3 > n1 && n3 > n2) may = n3;
        return may;
    }

    public static void main(String[] args) {
        float n1, n2, n3, res;
        Scanner Sebas = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Dame tres números separados por espacio ? ");
        n1 = Sebas.nextFloat(); n2 = Sebas.nextFloat(); n3 = Sebas.nextFloat();

        res = Mayor(n1, n2, n3);
        if (!(res == -1)) 
            System.out.println("\nEl mayor de los tres números es " + res);
        else
            System.out.println("\nNo hay un número mayor en los números que introdujiste");
       
    }
}