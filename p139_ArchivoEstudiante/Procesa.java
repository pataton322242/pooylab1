package p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void capturaDatos() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Promedio: ");
        double promedio = scanner.nextDouble();
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine(); 
        
        Estudiante estudiante = new Estudiante(nombre, edad, promedio, sexo);
        estudiantes.add(estudiante);
    }

    public void grabarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))) {
            oos.writeObject(estudiantes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("estudiantes.dat"))) {
            estudiantes = (ArrayList<Estudiante>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void mostrarDatos() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public void calcularPromedios() {
        double sumaPromedios = 0;
        int sumaEdades = 0;
        int hombres = 0;
        int mujeres = 0;

        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.getPromedio();
            sumaEdades += estudiante.getEdad();
            if (estudiante.getSexo() == 'H') {
                hombres++;
            } else if (estudiante.getSexo() == 'M') {
                mujeres++;
            }
        }

        double promedioCalificaciones = sumaPromedios / estudiantes.size();
        double promedioEdades = (double) sumaEdades / estudiantes.size();

        System.out.printf("Promedio de calificaciones: %.2f%n", promedioCalificaciones);
        System.out.printf("Promedio de edades: %.2f%n", promedioEdades);
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}