import java.util.Random;
class Program {
	public static void main(String[] args) {
		int ages[] = new int[1000];
		Random random = new Random();

		for(int i = 0; i < ages.length; i++) {
			ages[i] = random.nextInt(120);
		}

/*
		for(int i = 0; i < 100; i++) {
			System.out.println(ages[i]);
		}
*/
		// вывести на экран количество людей, с возрастами от 0 до 120
		
		int numAges[] = new int[120];

		for(int i = 0; i < 120; i++) {
			numAges[i] = 0;
		}

		for(int i = 0; i < 1000; i++) {
			numAges[ages[i]]++;
		}

		for(int i = 0; i < 120; i++) {
			System.out.println(i + " year = " + numAges[i]);
		}

	}
}