public class Square extends Forms implements Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int perimetr() {
        return 4 * a;
    }

    public double area() {
        return a * a;
    }
}
