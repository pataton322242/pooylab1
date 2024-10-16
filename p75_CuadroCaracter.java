import java.util.Scanner;

public class p75_CuadroCaracter {

    public static void cuadro(int r, int c, char car) {
        for(int i=1; i<= r; i++){
            for(int j=1; j<=c; j++)
                System.out.print(car);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int r, c;
        char car;
        Scanner Sebas = new Scanner(System.in);

        System.out.print("De cuantos renglones ? "); r = Sebas.nextInt();
        System.out.print("De cuantas columnas  ? "); c = Sebas.nextInt();
        System.out.print("De que caracter      ? "); car = Sebas.next().charAt(0);

        cuadro(r, c, car);

        
    }
}