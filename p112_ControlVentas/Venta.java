package p112_ControlVentas;

public abstract class Venta {
    private String Articulo; 
    private int Cantidad;
    private double Precio;
    protected double Total  = Cantidad * Precio;

public Venta(String articulo,int cantidad, double precio){
    Articulo= articulo;
    Cantidad = cantidad;
    Precio = precio;
    Total = cantidad * precio;
}
public abstract double getTotalVenta();
public String toString() {
    return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + Total + "]";
}



}
   
    

