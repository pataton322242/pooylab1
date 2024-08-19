import java.util.Scanner;

public class p14_CalculaTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingresa la cantidad de horas: ");
        int horas = scanner.nextInt();
        
       
        int dias = horas / 24;            
        int horasRestantes = horas % 24;   
        int minutos = horasRestantes * 60;  
        int segundos = minutos * 60;        
        
        
        System.out.println("Equivalente en días: " + dias);
        System.out.println("Horas restantes: " + horasRestantes);
        System.out.println("Equivalente en minutos: " + minutos);
        System.out.println("Equivalente en segundos: " + segundos);
        
        
    }
}

