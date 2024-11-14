import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String[] deportes = { "Futbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo" };
        File arch = new File("deportes.txt");
        System.out.print("\033[H\033[2J");

        if (!arch.exists()) {
            System.out.println("El archivo NO existe lo vamos a crear...");
            try {
                BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
                for (String deporte : deportes) {
                    fdeportes.write(deporte + "\n");

                    
                }
                fdeportes.close();
                System.out.println("El Archivo se creo con exito");
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo...");
                System.out.println(e);
            }
            
        } else {
            System.out.println("El archivo ya existe");
            
        }

        
    }
}