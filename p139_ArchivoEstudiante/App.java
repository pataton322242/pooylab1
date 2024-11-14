package p139_ArchivoEstudiante;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Procesa procesa = new Procesa();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Capturar datos de estudiante");
            System.out.println("2. Grabar datos en archivo");
            System.out.println("3. Leer datos desde archivo");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Calcular promedios y estadísticas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    procesa.capturaDatos();
                    break;
                case 2:
                    procesa.grabarDatos();
                    break;
                case 3:
                    procesa.leerDatos();
                    break;
                case 4:
                    procesa.mostrarDatos();
                    break;
                case 5:
                    procesa.calcularPromedios();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        scanner.close();
    }
}