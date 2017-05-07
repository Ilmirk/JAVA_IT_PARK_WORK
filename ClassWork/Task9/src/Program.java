/**
 * Created by Student18 on 08.04.2017.
 */
public class Program {
    public static boolean isDigit(char c) {
        if((int)c > 47 && (int)c < 58) {
            return true;
        } else {
            return false;
        }
    }
    public static int intFromChar(char c) {
        if((int)c == 57) {
            return c;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        char c = 'A';
        System.out.println(isDigit(c));
        System.out.println(intFromChar(c));

        char otherChar = '9';
        System.out.println(isDigit(otherChar));
        System.out.println(intFromChar(otherChar));
    }
}
