package p127_MiExcepcion;

//Para crear nuestra propia excepcion, hederamos de la clase Excepcion 
//Creamos un contructor, que pase el mensaje de error a la clase base 
public class FueraDeRango extends Exception {
    public FueraDeRango(String error) {
        super(error);
    }

}