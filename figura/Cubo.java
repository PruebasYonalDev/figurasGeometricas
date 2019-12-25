package figura;
import punto.P3;

/**
 * crea un objeto de tipo cubo
 * @author Yonal Londoño
 */
public class Cubo {

    /**
     * Atributos
     */
    private String coloFondo;
    private String colorArista;

    private P3[] vertices = new P3[8];

    public P3[] getVertices() {
        return vertices;
    }

    public void setVertices(P3[] vertices) {
        this.vertices = vertices;
    }

    public String getColoFondo() {
        return coloFondo;
    }

    public void setColoFondo(String coloFondo) {
        this.coloFondo = coloFondo;
    }

    public String getColorArista() {
        return colorArista;
    }

    public void setColorArista(String colorArista) {
        this.colorArista = colorArista;
    }

    public void dibujar() {
        System.out.println("Dibujando cubo");
    }
}
