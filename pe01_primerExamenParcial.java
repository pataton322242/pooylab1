// martin colmenero nava 


/*  Una escuela ha organizado un curso de técnicas avanzadas de programación y desea llevar el control de la
inscripción de los participantes y el dinero recaudado. */



import java.util.Scanner;

public class pe01_primerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
        int totalHombres = 0, totalMujeres = 0;
        int totalParticipantes = 0, totalRechazados = 0;
        int sumaEdades = 0;

        double totalDineroAlumnos = 0, totalDineroDocentes = 0, totalDineroTrabajadores = 0;
        double totalDineroGeneral = 0;

        System.out.print("\033[H\033[2J");System.out.flush();
        char continuar = 'S'; 

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Introduce el nombre del participante: ");
            String nombre = scanner.next();

            System.out.print(" edad : ");
            int edad = scanner.nextInt();

            System.out.print(" tipo de sexo (H/M): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("tipo de participante (Alumno, Docente, Trabajador): ");
            String tipoParticipante = scanner.next();

            if (edad < 23) {
                System.out.println("Lo sentimos, " + nombre + ", no puedes participar en el curso. (Rechazado)");
                totalRechazados++;
            } else {
        
                if (sexo == 'H' || sexo == 'h') {
                    totalHombres++;
                } else if (sexo == 'M' || sexo == 'm') {
                    totalMujeres++;
                }

                switch (tipoParticipante.toLowerCase()) {
                    case "alumno":
                        totalAlumnos++;
                        totalDineroAlumnos += 40;
                        break;
                    case "docente":
                        totalDocentes++;
                        totalDineroDocentes += 60;
                        break;
                    case "trabajador":
                        totalTrabajadores++;
                        totalDineroTrabajadores += 80;
                        break;
                    default:
                        System.out.println("Tipo de participante no válido. Reintente.");
                        continue;
                }

                totalParticipantes++; 
                sumaEdades += edad; 

                System.out.println("¡Bienvenido " + nombre + "! (Edad: " + edad + ", Sexo: " + sexo + ", Tipo: " + tipoParticipante + ")");
            }

            System.out.print("¿Deseas inscribir a otro participante? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        double promedioEdad = (totalParticipantes > 0) ? (double) sumaEdades / totalParticipantes  : 0;

        System.out.println("\n--- Resultados de la Inscripción ---");
        System.out.println("---Total de Alumnos---: " + totalAlumnos);
        System.out.println("---Total de Docentes---: " + totalDocentes);
        System.out.println("---Total de Trabajadores---: " + totalTrabajadores);
        System.out.println("---Total de Hombres---: " + totalHombres);
        System.out.println("---Total de Mujeres---: " + totalMujeres);
        System.out.println("---Total de Participantes---: " + totalParticipantes);
        System.out.println("---Promedio de Edad de los Participantes---: " + String.format("%.2f", promedioEdad));
        System.out.println("---Total de Rechazados---: " + totalRechazados);

        System.out.println("\n--- Dinero Recaudado ---");
        System.out.println("Dinero Recaudado de Alumnos: $" + totalDineroAlumnos);
        System.out.println("Dinero Recaudado de Docentes: $" + totalDineroDocentes);
        System.out.println("Dinero Recaudado de Trabajadores: $" + totalDineroTrabajadores);
        System.out.println("Dinero Recaudado General: $" + totalDineroGeneral);

        if (totalDineroGeneral < 50) {
            System.out.println("El evento concluye con ganancias BAJAS.");
        } else if (totalDineroGeneral >= 50 && totalDineroGeneral <= 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }

        scanner.close();
    }
}




























