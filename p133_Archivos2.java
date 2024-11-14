
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class p133_Archivos2 {
    public static void main(String[] args) {
        String[] ciudades = { "Zacatecas", "Fresnillo", "Cd Guzman", "Cd. Valles", "Sombrerete" };
        File arch = new File("ciudades.txt");
        System.out.print("\033[H\033[2J");

        if (!arch.exists()) {
            System.out.println("No existe, lo vamos a crear...");
            try {
                BufferedWriter fciudades = new BufferedWriter(new FileWriter(arch));
                for (String ciudad : ciudades) {
                    fciudades.write(ciudad + "\n");
                    
                }
                fciudades.close();
                System.out.println("Archivo creado con éxito");
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo...");
                System.out.println(e);
            }
        } else {
            System.out.println("El archivo ya existe");

        }

    }

}