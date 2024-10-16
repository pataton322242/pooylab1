public class p90_Temperaturas {
    public static void main(String[] args) {
        
        double[] temperaturas = {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};

        
        System.out.println("Primer elemento: " + temperaturas[0]);

       
        System.out.println("Tercer elemento: " + temperaturas[2]);

        
        System.out.print("Elementos del arreglo: ");
        for (double temp : temperaturas) {
            System.out.print(temp + " ");
        }
        System.out.println();

        
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }

        
        System.out.print("Elementos del arreglo después de poner a 0 los mayores a 10: ");
        for (double temp : temperaturas) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}

