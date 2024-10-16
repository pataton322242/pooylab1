package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    
    public Equipo() {
        jugadores = new ArrayList<>();
    }

   
    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        jugadores = new ArrayList<>();
    }


    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    
    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    
    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.toString().contains("Sexo=H")) {
                totalHombres++;
            }
        }
        return totalHombres;
    }

   
    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.toString().contains("Sexo=M")) {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    
    public void reporte() {
        System.out.println(">> Equipo [Nombre=" + nombre + ", Liga=" + liga + ", Jugadores=" + jugadores.size() + 
                           ", Bono=" + getTotalBono() + ", Total=" + getTotal() + 
                           ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]");
        for (Jugador jugador : jugadores) {
            System.out.println("- " + jugador);
        }
    }

    
    public String toString() {
        return "Equipo [Nombre=" + nombre + ", Liga=" + liga + "]";
    }
}
