package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nProbando clase CuentaBancaria:\n");
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        cuenta1.deposita(10000);
        System.out.println("El saldo es " + cuenta1.getSaldo());
        double cr = 56;
        boolean retiro = cuenta1.retira(cr);
        if (retiro)
            System.out.println("Retiro de " + cr + " efectuado con éxito, nuevo saldo " + cuenta1.getSaldo());
        else
            System.out.println("Ni para los cigarros tienes");

        System.out.println("\nProbando clase Cliente:\n");
        Cliente cliente1 = new Cliente("Juan Perez", cuenta1);
        System.out.println("cliente1" + cliente1);
        Cliente cliente2 = new Cliente("Martin", new CuentaBancaria(1000));
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);

        System.out.println("\nProbando clase Banco");
        Banco mibanco = new Banco("Banco mamitas puebla", "campus siglo21");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Lesley Viviana", new CuentaBancaria(220000));
        mibanco.agregarCliente(cliente3);
        mibanco.getClientes().get(0).getCuenta().deposita(1500);
        mibanco.getClientes().get(1).getCuenta().retira(1000);
        mibanco.getClientes().get(2).getCuenta().deposita(12000);
        System.out.println("\nResumen del Banco \n");
        System.out.println(mibanco);
        double totalbanco = 0.0;
        for (Cliente cliente : mibanco.getClientes()) {
            System.out.println(cliente);
            totalbanco += cliente.getCuenta().getSaldo();

        }
        System.out.println("\nTotal de dinero en el Banco : " + totalbanco);
    }
}