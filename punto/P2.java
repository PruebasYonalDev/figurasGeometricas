package punto;

/**
 * Esta clase representa un pundo en 2D con las coordenadas x e y
 * @author Yonal Londoño
 */
public class P2 {

    // Atributos
    private int x;
    private int y;

    /**
     * Crea una instancia del objeto P2
     */
    public P2(){
        this.x = this.y = 0;
    }

    /**
     * Crea una instancia del objeto P2
     * @param x coordenada x
     * @param y coordenada y
     */
    public P2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instacia del objeto P2
     * @param p2 es un objeto de punto de dos dimenciones (P2)
     */
    public P2(P2 p2) {
        this.x = p2.getX();
        this.y = p2.getY();
    }

    /**
     * retorna el valor de x
     * @return returna un int x
     */
    public int getX() {
        return this.x;
    }

    /**
     * Asigna el valor de x
     * @param x coordenada x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * retorna el valor de y
     * @return returna un int y
     */
    public int getY() {
        return this.y;
    }

    /**
     * Asigna el valor de y
     * @param y coordenada y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calcula la distancia entre dos puntos
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y) {

        double distancia;

        double diferenciaDeCuadradosX = Math.pow(this.x - x, 2);
        double diferenciaDeCuadradosY = Math.pow(this.y - y, 2);

        distancia = Math.sqrt((diferenciaDeCuadradosX + diferenciaDeCuadradosY));

        return distancia;
    }

    /**
     * Calcular la distancia de los puntos de un objetos
     * @param p2 objeto tipo P2
     * @return distancia
     */
    public double calcularDistancia(P2 p2) {
        return this.calcularDistancia(p2.getX(), p2.getX());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("x: ").append(this.x).append("y: ").append(this.y);

        return sb.toString();
    }
}
