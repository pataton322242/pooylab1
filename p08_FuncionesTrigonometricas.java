import java.util.Scanner;

public class p08_FuncionesTrigonometricas {
    public static void main(String[] args) {
        System.out.print("\033¨[H\033[2J");System.out.flush();

        System.out.print("dame un angulo en grados:");
        double angulog= new Scanner(System.in).nextDouble();
        double angulor= Math.toRadians(angulog);

        double sen = Math.sin(angulor);
        double cos = Math.cos(angulor);
        double tan = Math.tan(angulor);

        System.out.print(String.format("el angulo es: %.2f,Seno %.2f,Coseno:%.2f,Tangente:%.2f",angulor,sen,cos,tan));
        


        



    }
}
