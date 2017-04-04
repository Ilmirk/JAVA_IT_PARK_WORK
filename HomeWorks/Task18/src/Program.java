
//Вывести количество всех возрастов от 1 до 120
public class Program {
    public static void main(String[] args) {

        Human humans[] = new Human[]{
                new Human("Иван", 53),
                new Human("Ильмир", 27),
                new Human("Гульназ", 42),
                new Human("Андрей", 30),
                new Human("Юрий", 18),
                new Human("Стас", 10),
                new Human("Елена", 74),
                new Human("Альберт", 14),
                new Human("Костя", 17),
                new Human("Марсель", 22),
                new Human("Иван", 56),
                new Human("Ильмир", 34),
                new Human("Гульназ", 76),
                new Human("Андрей", 38),
                new Human("Юрий", 23),
                new Human("Стас", 11),
                new Human("Елена", 65),
                new Human("Альберт", 14),
                new Human("Костя", 17),
                new Human("Марсель", 23)};

        int[] array = new int[120]; // Создаем массив от 1 до 120
        for (int i = 1; i < array.length; i++ ){
            array[i] = 0;
        }

        for (int i = 1; i < array.length; i++ ) { // Считаем кол-во
            for (int j = 0; j < humans.length; j++) {
                if (humans[j].getAge() == i) {
                    array[i]++;
                }
            }
        }

        System.out.println("Возраст Кол-во");
        for (int i = 1; i < array.length; i++) {
            System.out.println(i + "\t\t" + array[i]);

        }
    }
}