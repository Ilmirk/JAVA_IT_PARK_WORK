Посчитать сумму чисел, порядок вхождения которых - четное число

import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int i = 1;
        int c = 0;

        while (a != -1) {

            if (i % 2 == 0) {
                c += a;
            }

            a = scanner.nextInt();
            i++;
        }

        System.out.println (c);
    }
}