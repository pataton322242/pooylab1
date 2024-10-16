package p105_PuntoTriangulo;

public class Punto {
        private int x;
        private int y;
    
        // Constructor por defecto
        public Punto() {
            this.x = 0;
            this.y = 0;
        }
    
        // Constructor con parámetros
        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
    
        // Métodos getters y setters
        public int getX() {
            return x;
        }
    
        public void setX(int x) {
            this.x = x;
        }
    
        public int getY() {
            return y;
        }
    
        public void setY(int y) {
            this.y = y;
        }
    
        // Método para calcular la distancia entre dos puntos
        public double getDistancia(Punto punto) {
            int deltaX = this.x - punto.getX();
            int deltaY = this.y - punto.getY();
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        }
    
        // Método toString
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
    
    

