class Sort {
	public static int[] merge(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while(i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}

		
		while(i < a.length) {
			c[k] = a[i];
			i++;
			k++;
		}
		
		while(j < b.length) {
			c[k] = b[j];
			j++;
			k++;
		}
		return c;
	}
}