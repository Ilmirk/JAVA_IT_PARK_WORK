//Сумма элементов массива

import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Введите количество элементов массива:");
        int arrays = scanner.nextInt();

        int arr[] = new int[arrays];
        int sum = 0;

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println("Сумма элементов массива = " + sum);
    }
}