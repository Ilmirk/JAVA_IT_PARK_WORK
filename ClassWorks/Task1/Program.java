class Program {
	public static void main(String[] args) {
		
		int a[] = {-3, 10, 11, 12, 15, -5};
		
		int minIndex = 0;
		int maxIndex = 0;

		int min = a[0];
		
		for (int i = 1; i < a.lenght; i++) {
			if (min > a[i]) {
		    	min = a[i];
				minIndex = i;

		}
		int max = a[0];

		for (int i = 1; i < b.lenght; i++) {
			if (max < b[i]);
			    max = b[i];
			    maxIndex = i;

		}
	}
	System.out.println(min);
	System.out.println(max);

}