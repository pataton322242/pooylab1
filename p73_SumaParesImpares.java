import java.util.Scanner;
public class p73_SumaParesImpares {
    public static int SumaParImpar(int ini, int fin, int poi){
        int suma=0;
        for(int i=ini; i <=fin; i++) {
            if(poi=='P' && i%2==0){
                System.out.println(i);
                suma+=i;
            } else if(poi=='I' && i%2!=0){
                System.out.print(i+" ");
                suma+=i;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int ini, fin, suma;
        char poi;
        Scanner Sebas = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Suma Pares o Impares en un rango de valores... ");
        do{
            System.out.print("Dame el inicio :"); ini = Sebas.nextInt();
            System.out.print("Dame el final  :"); fin = Sebas.nextInt();
        } while(fin<ini);
        System.out.println("\n[P]ares\n[I]mpares"); poi = Character.toUpperCase(Sebas.next().charAt(0));

        suma = SumaParImpar(ini, fin, poi);

        if(suma!= -1)
        System.out.println("\nLa suma es :"+ suma);
        else
        System.out.println("Solo puedo sumar pares e impares");
        
    }
}