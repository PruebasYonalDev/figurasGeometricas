package punto;

/**
 * Esta clase representa un punto en 3D
 * @author Yonal Londoño
 */
public class P3 extends  P2 {

    /**
     * Atributos
     */
    private int z;

    /**
     * Construye o crea un objeto de P3
     */
    public P3(){
        super();
        this.z = 0;
    }

    /**
     * Crea un ojeto de tipo P3
     * @param x coordenadas x
     * @param y coordenadas y
     * @param z coordenadas z
     */
    public P3(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p2 objeto tipo P2
     * @param z coordenadas re
     */
    public P3(P2 p2, int z) {
        super(p2);
        this.z = z;
    }

    public P3(P3 p3) {
        this(p3.getX(), p3.getX(), p3.getZ());
    }

    /**
     * Retorna coordenada Z
     * @return coordenada z
     */
     public int getZ() {
        return this.z;
     }

    /**
     * Asigna un valor a la coordenada z
     * @param z
     */
    public void setZ(int z) {
        this.z = z;
     }

    /**
     * calcular distancia entre dos puntos de 3D
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @param z coordenada z del otro punto
     * @return distancia
     */
     public double calcularDistancia(int x, int y, int z) {

         double distancia;

         double diferenciaDeCuadradosX = Math.pow(getX() - x, 2);
         double diferenciaDeCuadradosY = Math.pow(getY() - y, 2);
         double diferenciaDeCuadradosZ = Math.pow(this.z - z, 2);

         distancia = Math.sqrt((diferenciaDeCuadradosX + diferenciaDeCuadradosY + diferenciaDeCuadradosZ));

         return distancia;

     }

    /**
     * calcula la distancia entre dos puntos de 3D
     * @param p2 objeto de tipo P2
     * @param z coordenada z
     * @return
     */
     public double calcularDistancia(P2 p2, int z) {
         return calcularDistancia(p2.getX(), p2.getY() ,z);
     }

    /**
     * calcula la distancia entre dos puntos de 3D
     * @param p3 objeto de tipo P3
     * @return distancia
     */
     public double calcularDistancia(P3 p3) {
         return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
     }

     public String toString() {
         return super.toString() + "z: " + this.z;
     }
}
