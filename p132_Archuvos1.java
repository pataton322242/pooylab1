import java.io.File;

public class p132_Archuvos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        File arch = new File("datos.txt");
        System.out.println("Nombre de archivo: " + arch.getName());
        System.out.println("Es un Directorio?: " + arch.isDirectory());
        System.out.println("Es un archivo?: " + arch.isFile());
        System.out.println("Ruta Relativa: " + arch.getPath());
        System.out.println("Ruta Relativa: " + arch.getAbsolutePath());
        if (arch.exists()) {
            System.out.println("El archivo existe");
            System.out.println("Se puede leer ?" + arch.canRead());
            System.out.println("Se puede escribir? " + arch.canWrite());
            System.out.println("Longitud del archivo: " + arch.length());
        } else {
            System.out.println("El archivo No existe");
        }

    }
}