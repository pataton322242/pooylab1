

import java.util.Scanner;
public class p02_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio= new Scanner(System.in);

        System.out.println("\nCalculando el area del cierculo\n");
        System.out.print("Dame el radio ? ");
        radio = lradio.nextDouble();
        area = Math.PI * Math.pow(radio, 2);

        System.out.println(" el circulo de radio "+ radio + " tiene un area de " + area);
    }
}
