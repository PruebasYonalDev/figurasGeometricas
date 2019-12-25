package figura;
import punto.P4;

public class Trapecio {

    private String colorFondo;
    private String coloArista;

    private P4[] vertices = new P4[5];

    public P4[] getVertices() {
        return vertices;
    }

    public void setVertices(P4[] vertices) {
        this.vertices = vertices;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColoArista() {
        return coloArista;
    }

    public void setColoArista(String coloArista) {
        this.coloArista = coloArista;
    }

    public void dibujar() {
        System.out.println("Dibujando un trapecio");
    }


}
