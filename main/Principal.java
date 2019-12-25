package main;
import punto.P2;
import punto.P3;
import figura.Cubo;
import figura.Triangulo;

public class Principal {

    public static void main(String[] args) {
        P2 punto2 = new P2();
        P2 segundoPunto = new P2(1,2);
        P2 p3 = new P2(segundoPunto);
        P3 C4 = new P3();
        P3 C5 = new P3(1, 2,3);
        P3 C6 = new P3(segundoPunto, 2);
        P3 C7 = new P3(C5);

        Triangulo equilatero = new Triangulo();
        equilatero.setPunto1(punto2);
        equilatero.setPunto2(segundoPunto);
        equilatero.setPunto3(p3);

        Cubo cubo = new Cubo();
        cubo.getVertices()[0] = new P3(3,4,5);
        cubo.getVertices()[1] = new P3(3,4,5);
        cubo.getVertices()[2] = new P3(3,4,5);
        cubo.getVertices()[3] = new P3(3,4,5);
        cubo.getVertices()[4] = new P3(3,4,5);

        P3[] a = cubo.getVertices();
        for (P3 p :
                a) {
            System.out.println(p);
        }

        P2 pruebaLiskov = new P3();
        ((P3)pruebaLiskov).getZ();

        //System.out.println(p3);
        //System.out.println(punto2.calcularDistancia(1,2));
        //System.out.println(punto2.calcularDistancia(segundoPunto));
        //System.out.println(C4);
        //System.out.println(C4);
        //System.out.println(C7);
        //SSystem.out.println(C7);
    }

}
