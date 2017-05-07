class Program {
	public static int numberSum(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int x = 6;
		int y = 8;
		int c = numberSum(x, y);

		System.out.println(c);	
	}
}