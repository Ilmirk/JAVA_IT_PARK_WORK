import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        Verificator verificator = new Verificator();
        System.out.println("Введите пароль: ");

        while (true) {
            password = scanner.nextLine();
            try {
                verificator.verify(password);
                return;
            } catch (PasswordExeption e) {
                System.out.println("Введите заного пароль: ");
            }
        }
    }
}