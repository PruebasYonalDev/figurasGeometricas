package punto;

public class P4 extends P3 {

    private int a;

    public P4() {
        super();
        this.a = 0;
    }

    public P4(int x, int y, int z, int a) {
        super(x, y, z);
        this.a = a;
    }

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

    public double calcularDistancia(int x, int y, int z, int a) {

        double distancia;

        double diferenciaDeCuadradosX = Math.pow(getX() - x, 2);
        double diferenciaDeCuadradosY = Math.pow(getY() - y, 2);
        double diferenciaDeCuadradosZ = Math.pow(getZ() - z, 2);
        double diferenciaDeCuadradosA = Math.pow(getA() - a, 2);

        distancia = Math.sqrt((diferenciaDeCuadradosX + diferenciaDeCuadradosY + diferenciaDeCuadradosZ + diferenciaDeCuadradosA));

        return distancia;
    }

    public double calcularDistancia(P4 p4) {
        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getA());
    }

    public String toString() {
        return  super.toString() + "a: " + this.a;
    }
}
