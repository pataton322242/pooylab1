import java.util.Scanner; 

public class p122_Excepcion2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        
        try { //Aqui se pone el codigo que puede generar el error 

            System.out.println("Dame un numero");
            int val = new Scanner (System.in).nextInt();
            val = val + 5;
            System.out.println("El nuevo valor es : " + val);
            
        } catch (Exception e) { //Aqui atrapamos el error (excepcion y mandamos un mensaje personalizado)
            System.out.println("Debes de introducir un número !!!");
        }
        System.out.println("El mundo sigue ..");
    }
}