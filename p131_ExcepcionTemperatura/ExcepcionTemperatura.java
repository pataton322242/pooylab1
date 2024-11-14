package p131_ExcepcionTemperatura;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExcepcionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        
        while (true) {
            try {
                System.out.print("Dame una temperatura en centigrados: ");
                float temperatura = scanner.nextFloat();
                
                if (temperatura > 100) {
                    throw new TemperaturaExcesiva("Temperatura demasiado alta");
                }
                
                float fahrenheit = convertirAFahrenheit(temperatura);
                System.out.printf("%.2f grados centigrados, equivale a %.2f grados farenheit\n", temperatura, fahrenheit);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un valor numérico");
                scanner.next();
            } catch (TemperaturaExcesiva e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
    
    public static float convertirAFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }
}