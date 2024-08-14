
import java.util.Scanner;

public class p04_pagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta,paganeta;
        Scanner obj = new Scanner(System.in);
        //entrada
        System.out.println("Ingrese el nombre del trabajador:"); nombre = obj.nextLine();
        System.out.println("Ingrese las horas trabajadas:"); horas = obj.nextInt();
        System.out.println("Ingrese la tasa de paga por hora:"); paga =obj.nextFloat();
        tasa =.03;
        //calculo
        pagabruta =horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        //salida
        System.out.println("\nResumen de pagos\"");
        System.out.println(String.format("el trabajador %s, trabajo %d horas, a una paga de %.2f persos la hora, con una tasa de impuesto de %.2f",nombre,horas,paga,tasa));
        System.out.println(String.format("paga bruta          = %.2f", pagabruta));
        System.out.println(String.format("impuestos           = %.2f", impuesto));
        System.out.println(String.format("paga neta          = %.2f", paganeta));
    }
    
}
