import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor del radio: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingresa el valor de la altura: ");
        double altura = scanner.nextDouble();
        double volumen = Math.PI * (radio * radio) * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
        
    }
}
