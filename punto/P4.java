package punto;

/**
 * Esta clase representa un punto en 4D
 * @author Yonal Londoño
 */
public class P4 extends P3 {

    /**
     * Atributos
     */
    private int a;

    /**
     * Construye o crea un objeto de P4
     */
    public P4() {
        super();
        this.a = 0;
    }

    /**
     * Crea un ojeto de tipo P4
     * @param x coordenadas x
     * @param y coordenadas y
     * @param z coordenadas z
     * @param a coordenadas a
     */
    public P4(int x, int y, int z, int a) {
        super(x, y, z);
        this.a = a;
    }

    /**
     * Crea un objeto de tipo P4
     * @param p3 objeto tipo P3
     * @param a coordenadas a
     */
    public P4(P3 p3, int a) {
        super(p3);
        this.a = a;
    }

    public int getA() {
        return this.a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public P4(P4 p4) {
        this(p4.getX(), p4.getY(), p4.getZ(), p4.getA());
    }

    /**
     * calcular distancia entre dos puntos de 4D
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @param z coordenada z del otro punto
     * @param a coordenada a del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y, int z, int a) {

        double distancia;

        double diferenciaDeCuadradosX = Math.pow(getX() - x, 2);
        double diferenciaDeCuadradosY = Math.pow(getY() - y, 2);
        double diferenciaDeCuadradosZ = Math.pow(getZ() - z, 2);
        double diferenciaDeCuadradosA = Math.pow(getA() - a, 2);

        distancia = Math.sqrt((diferenciaDeCuadradosX + diferenciaDeCuadradosY + diferenciaDeCuadradosZ + diferenciaDeCuadradosA));

        return distancia;
    }

    /**
     * calcula la distancia entre dos puntos de 3D
     * @param p4 objeto de tipo P4
     * @return calcularDistancia
     */
    public double calcularDistancia(P4 p4) {
        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getA());
    }

    public String toString() {
        return  super.toString() + "\na: " + this.a + "\n ****************";
    }
}
