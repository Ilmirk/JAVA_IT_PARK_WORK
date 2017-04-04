<<<<<<< HEAD
/**
 * Created by Ilmir on 28.03.2017.
 */

// Создать массив людей, сортировать пузырьком по возрасту
public class Program {
    public static void main(String[] args) {

        Human humans[] = new Human[] {
                new Human("Иван",53),
                new Human("Ильмир",27),
                new Human("Гульназ",42),
                new Human("Андрей",30),
                new Human("Юрий",18),
                new Human("Стас",10),
                new Human("Елена",74),
                new Human("Альберт",14),
                new Human("Костя",17),
                new Human("Марсель", 22) };

        for (int i = 0; i < humans.length; i++){
            System.out.println("Имя  = \t" + humans[i].getName() + "\t Возраст = " + humans[i].getAge());
        }

        Human temp;
        for(int i = humans.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(humans[j].getAge() > humans[j + 1].getAge()) {
                    temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Имя \t Возраст");
        System.out.println("----------------");
        for (int i = 0; i < humans.length; i++){
            System.out.println(humans[i].getName() + "\t " + humans[i].getAge());
        }
    }
=======
/**
 * Created by Ilmir on 28.03.2017.
 */

// Создать массив людей, сортировать пузырьком по возрасту
public class Program {
    public static void main(String[] args) {

        Human humans[] = new Human[] {
                new Human("Иван",53),
                new Human("Ильмир",27),
                new Human("Гульназ",42),
                new Human("Андрей",30),
                new Human("Юрий",18),
                new Human("Стас",10),
                new Human("Елена",74),
                new Human("Альберт",14),
                new Human("Костя",17),
                new Human("Марсель", 22) };

        for (int i = 0; i < humans.length; i++){
            System.out.println("Имя  = \t" + humans[i].getName() + "\t Возраст = " + humans[i].getAge());
        }

        Human temp;
        for(int i = humans.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(humans[j].getAge() > humans[j + 1].getAge()) {
                    temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Имя \t Возраст");
        System.out.println("----------------");
        for (int i = 0; i < humans.length; i++){
            System.out.println(humans[i].getName() + "\t " + humans[i].getAge());
        }
    }
>>>>>>> 79d7bb2ba368a0561bbd8cad5fadccaf7a1e54fa
}