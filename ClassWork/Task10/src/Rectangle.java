/**
 * Created by Student18 on 15.04.2017.
 */
public class Rectangle {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "I'm Rectangle " + "a = " + getA() + ", b = " + getB() + ".";
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
