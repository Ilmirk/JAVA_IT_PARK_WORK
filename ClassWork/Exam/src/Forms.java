/**
 * Created by Student18 on 08.04.2017.
 */
public abstract class Forms {
    protected int perimetr;
    protected double area;

    public abstract int perimetr();
    public abstract double area();

    public boolean Equals(Forms obj) {
        if(this.area() == obj.area() && this.perimetr() == obj.perimetr() && this.getClass() == obj.getClass()) {
            return true;
        }   else {
            return false;
        }
    }
}
