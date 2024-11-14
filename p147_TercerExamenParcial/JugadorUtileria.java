package p147_TercerExamenParcial;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JugadorUtileria {
    private static final String ARCHIVO_DATOS = "jugadores.dat";

    // Método para guardar la lista de jugadores en un archivo
    public static void guardarJugadores(List<Jugador> jugadores) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_DATOS))) {
            oos.writeObject(jugadores);
        }
    }

    // Método para cargar la lista de jugadores desde un archivo
    public static List<Jugador> cargarJugadores() throws IOException, ClassNotFoundException {
        File archivo = new File(ARCHIVO_DATOS);
        if (!archivo.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Jugador>) ois.readObject();
        }
    }
}

