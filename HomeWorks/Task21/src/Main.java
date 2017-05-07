public class Main {
    public static int arrCharToStr(char arrChar[]) {
        int result = 0;
        int x = 1;

        for(int i = arrChar.length-1; i>=0; i--) {
            result = result + ((int)arrChar[i] - (int)'0') * x;
            x *=10;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] arr = {'3', '2', '1'};
        System.out.println(arrCharToStr(arr));
    }
}