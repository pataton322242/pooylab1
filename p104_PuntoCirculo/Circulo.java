package p104_PuntoCirculo;

public class Circulo {
        private Punto centro;
        private double radio;
    
        // Constructor por defecto
        public Circulo() {
            this.centro = new Punto();
            this.radio = 1.0; // Radio por defecto
        }
    
        // Constructor con radio
        public Circulo(double radio) {
            this.centro = new Punto();
            this.radio = radio;
        }
    
        // Constructor con centro y radio
        public Circulo(Punto centro, double radio) {
            this.centro = centro;
            this.radio = radio;
        }
    
        // Métodos getters y setters
        public Punto getCentro() {
            return centro;
        }
    
        public void setCentro(Punto centro) {
            this.centro = centro;
        }
    
        public double getRadio() {
            return radio;
        }
    
        public void setRadio(double radio) {
            this.radio = radio;
        }
    
        // Método para calcular el área del círculo
        public double getArea() {
            return Math.PI * radio * radio;
        }
    
        // Método para calcular la circunferencia del círculo
        public double getCircunferencia() {
            return 2 * Math.PI * radio;
        }
    
        // Método toString
        @Override
        public String toString() {
            return "Centro: " + centro.toString() + ", Radio: " + radio;
        }
    }
    
    

