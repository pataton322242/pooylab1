package p106_Persona;



public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Persona p1 = new Persona("Juan perez", "Sierra de Cerdos 123", 41);
        Persona p2 = new Persona("Juana perez", "Lo de vega 34", 23);

        Estudiante e1 = new Estudiante("Aaron Reyes", "Ojo Caliente", 25,"Ing Software", 2003, 700);
        Estudiante e2 = new Estudiante("Refugio Hernandez", "Trancoso", 34,"Robotica", 2005, 500);

        Apoyo a1 = new Apoyo("Emmanuel", "Av Mexico", 25, "Jardinero", "Preparatoria", 1500);
        Apoyo a2 = new Apoyo("Roberto Almeida", "Trancoso", 45, "Secreteria", "Lic contablidad", 2500);


        System.out.print("\033[H\033[2J");
        System.out.println("Personas");
        System.out.println(p1);
        System.out.println(p2);
        
        
        System.out.println("\nEstudiantes");
        System.out.println(e1);
        System.out.println(e2);
        
        System.out.println(e1 instanceof Persona);
        
        System.out.println("\nPersonal Apoyo");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 instanceof Persona);
        
    }
    
}