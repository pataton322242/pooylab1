package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        Maquina vochito = new Sedan("Vochito", "Refugio Hernandez", 4);
        Maquina mamalona = new Suv("Mamalona", "Aaron Reyes", 5);

        System.out.println(vochito);
        ((Vehiculo) vochito).sistemaElectrico();
        ((Vehiculo) vochito).combustionInterna();
        ((Familiar) vochito).carroceriaTres();
        ((Familiar) vochito).chasisMonocasco();
        vochito.reposar();
        vochito.arrancar();
        vochito.frenar();

        System.out.println("\n" + mamalona);
        ((Vehiculo) mamalona).sistemaElectrico();
        ((Vehiculo) mamalona).combustionInterna();
        ((TodoTerreno) mamalona).traccion4x4();
        ((TodoTerreno) mamalona).chasisIndependiente();
        mamalona.reposar();
        mamalona.arrancar();
        mamalona.frenar();

    }

}