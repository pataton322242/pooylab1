import java.util.Scanner;

public class p80_Angulo {
    public static String Angulo(int angulo) {
        if ( angulo < 90 ) return " agudo ";
        if ( angulo == 90 ) return " recto ";
        if ( angulo > 90 && angulo < 180 ) return " obtuso ";
        if ( angulo == 180 ) return " llano ";
        if ( angulo > 180 && angulo < 360) return " cóncavo ";
        if  (angulo == 360 ) return " completo ";
        return "Ángulo no válido ";
    }
    public static void main(String[] args) {
        Scanner Sebas = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.println("Por favor ingresa el ángulo ");
        int angulo = Sebas.nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("El ángulo ingresado no es válido");

        } else {
            String ResultadoAngulo = Angulo(angulo);
            System.out.println("El angulo es" + ResultadoAngulo);
        }
      
    }
}
