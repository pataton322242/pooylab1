public class p05_OperacionesMatematicas {

    public static void main(String[] args) {
        double x,y, suma,resta,mult,div,res,pot;
        x = 10.5;
        y = 2.5;
        suma = x + y;
        resta = x - y;
        mult = x * y;
        div = x / y;
        res = x % y;
        pot =Math.pow(x,y);
        System.out.println(String.format("los numeros son: %.2f,%.2f",x,y));
        System.out.println("\nEl resultado de las operaciones es la siguiente:\n");
        System.out.println(String.format("suma:%.2f\nresta:%.2f",suma,resta));
        System.out.println(String.format("multiplicacion:%.2f\ndivision:%.2f",mult,div));
        System.out.println(String.format("residuo:%.2f\npotencia:%.2f",res,pot));
    }

}