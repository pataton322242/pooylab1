package p113_SegundoExamenParcial;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        Equipo miequipo = new Equipo("Limones", "Torneo la Bombonera");

        miequipo.reporte();

        
        miequipo.agregarJugador(new JugadorEntrenador("MAX MONTOYA", 'H', "Entrenador Principal", 1000, 8, 1));
        miequipo.agregarJugador(new JugadorEntrenador("LUIS OBED", 'H', "Entrenador de Apoyo", 900, 10, 2));
        miequipo.agregarJugador(new JugadorActivo("MARTIN COLMENRO", 'H', "Principal No 11", 100, 2, 2));
        miequipo.agregarJugador(new JugadorActivo("AARON REYES", 'H', "Principal No 16", 100, 3, 1));
        miequipo.agregarJugador(new JugadorActivo("LESLEY MARQUEZ", 'M', "Principal No 21", 100, 3, 3));
        miequipo.agregarJugador(new JugadorActivo("MARCO ANTONIO OLIVA", 'H', "Banca No 10", 120, 4, 1));
        miequipo.agregarJugador(new JugadorActivo("VICTOR CERVANTES", 'H', "Banca No 15", 150, 4, 4));
        miequipo.agregarJugador(new JugadorActivo("VIVIANA MEDINA", 'M', "Banca No 20", 350, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("Andrea Solis", 'M', "Principal No 12", 550, 5, 5));
        miequipo.agregarJugador(new JugadorActivo("Marissa Hernandez", 'M', "Principal No 12", 600, 4, 2));
        miequipo.agregarJugador(new JugadorActivo("patrcia melano", 'M', "Principal No 12", 700, 5, 3));

        miequipo.reporte();
    }
}

