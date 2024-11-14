import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p126_Excepcion6 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        System.out.println("Dame el nombre del archivo ?");
        String nomarch = new Scanner(System.in).nextLine();

        
        try {
            File nombre = new File(nomarch);
            Scanner obj = new Scanner(nombre);

            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }
            obj.close();
        } catch (Exception e) {
            System.out.println("El archivo pretendes leer, no existe ...");
        }

    }
}