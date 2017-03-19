// Написать функцию проверки числа на простоту. (boolean-функция)

import java.util.Scanner;

class Program{

    public static boolean function(int b){
        String c;
        int k=0;
        for (int i = 2; i < b ; i++){
            if (b%i == 0)
                k++;
        }
        System.out.println();
        if(k==0)
            return	true;
        else
            return	false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println();
        a = scanner.nextInt();
        if(function(a) == true)
            System.out.println( + a + " - Простое число");
        else
            System.out.println( + a + " - Не простое число");
        System.out.println();
    }
}