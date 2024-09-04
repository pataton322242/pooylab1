import java.util.Scanner;

public class p41_ProcesaCalificaciones {
    public static void main(String[] args) {
        int n, c;
        float calif, suma=0, prom=0;
        Scanner obj = new Scanner(System.in);
        calif = suma = prom = 0;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Calcula la suma y el promedio de n calificaciones");
        System.out.print("Cuantas calificaciones ? ");
        n = obj.nextInt();
        c = 1;
        while (c <= n) {
            System.out.printf("Calificacion %d = " , c);
            c++;
            calif = obj.nextFloat();
            suma = suma + calif;
        }
        prom = suma / n;
        System.out.printf("La suma es : %.2f\n", suma);
        System.out.printf("El promedio es : %.2f\n", prom);
    }
}
