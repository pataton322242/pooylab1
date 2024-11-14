package p119_Organismo;

public class Perro extends Organismo implements Canino  {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void correr() {
        System.out.println("Es un canino que corre, es un perro");
        
    }

    @Override
    public void cuatroPatas() {
       System.out.println("Es un canino que camina en cuatro patas, es un perron");
        
    }

    @Override
    public void multiCelular() {
        System.out.println("Es un animal multicelular, es un perro");
    }

    @Override
    public void sangreCaliente() {
        System.out.println("Es un animal de sangre caliente, es un perrote");
    }
    


    
}