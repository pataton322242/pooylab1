import java.util.Scanner;

public class p10_CalcularHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos los valores de los catetos
        System.out.print("Ingresa el valor del cateto a: ");
        double catetoA = scanner.nextDouble();
        
        System.out.print("Ingresa el valor del cateto b: ");
        double catetoB = scanner.nextDouble();
        
        // Calculamos la hipotenusa usando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
        
        // Mostramos el resultado
        System.out.println("La hipotenusa es: " + hipotenusa);
        
        
    }
}

