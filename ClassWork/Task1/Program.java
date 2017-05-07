import java.util.Scanner;

class Program {
	public static void main(String[] args) {
			int a[] = {-3, 10, 11, 12, 15, -5};

			int min = a[0];
			int max = a[0];

			int indexMin = 0;
			int indexMax = 0;

			for(int i = 1; i < a.length; i++) {
				if(a[i] < min) {
					min = a[i];
					indexMin = i;
				}
				if (a[i] > max) {
					max = a[i];
					indexMax = i;
				}
			}

			int t;

			t = a[indexMax];
			a[indexMax] = a[indexMin];
			a[indexMin] = t;

			for(int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
				System.out.println();
			}

			Scanner scanner = new Scanner(System.in);

			int x = scanner.nextInt();
			int searchIndex = -1;

			for(int i = 0; i < a.length; i++) {
				if(a[i] == x) {
					searchIndex = i;
				}
			}

			System.out.println(searchIndex);
	}
}