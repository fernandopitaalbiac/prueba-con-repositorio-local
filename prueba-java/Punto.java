public class Punto {

    public int x;

    public int y;

    public Punto(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public void muestraPunto(int a, int b) {

        Punto punto = new Punto(a, b);

        System.out.println("Punto (" + punto.x + " , " + punto.y + ")");

    }
}