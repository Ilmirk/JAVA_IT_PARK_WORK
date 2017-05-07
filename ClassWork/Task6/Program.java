class Program {
	public static void main(String[] args) {
		int a[] = {3, 4, 8, 9, 15};
		int b[] = {1, 3, 6, 8, 17, 21, 26};
		int c[];
		c = Sort.merge(a, b);

		for (int i = 0; i < c.length; i++) {

			System.out.print(c[i] + " ");

		}

	}
}