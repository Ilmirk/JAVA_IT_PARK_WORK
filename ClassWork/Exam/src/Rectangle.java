public class Rectangle extends Forms implements Figure{
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public int perimetr() {
        return 2 * (a + b);
    }

}
