/**
 * Created by Student18 on 15.04.2017.
 */
public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return "I'm Triangle " + "a = " + getA() + ", b = " + getB() + ", c = " + getC() + ".";
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
