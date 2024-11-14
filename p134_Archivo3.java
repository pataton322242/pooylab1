import java.io.*;
import java.util.ArrayList;

public class p134_Archivo3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        File arch = new File("ciudades.txt");
        ArrayList<String> ciudades = new ArrayList<String>();

        if (arch.exists()) {
            try {
                BufferedReader fciudades = new BufferedReader(new FileReader(arch));
                String linea;
                while ((linea = fciudades.readLine()) != null) {
                    System.out.println(linea);
                    ciudades.add(linea);
                }
                fciudades.close();
                System.out.println("\nLas ciudades que ya estan ya en el arreglo");
                for (String ciudad : ciudades) {
                    System.out.println(ciudad);
                }

            } catch (Exception e) {

            }

        } else {

        }

    }
}