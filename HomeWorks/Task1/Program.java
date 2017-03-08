import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        int a;
        int i = 2;
        int c = 1;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        while (a != -1) {
            while ((i*i <= a)&&(a % i != 0)) {
                i++;
            }
            if (i*i > a) {
                c = c * a;
            }
            a = scanner.nextInt();
        }
        System.out.println (c);
    }
}