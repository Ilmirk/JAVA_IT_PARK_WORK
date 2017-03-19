// Найти максимальный элемент в каждом столбце матрицы

	class Program{

		public static void maxnumber(int b[][]){
			int max;
			for (int j=0;j<b[0].length;j++){
				max=b[0][j];
				for (int i=0; i<b.length;i++){
					if(b[i][j]>max)
						max=b[i][j];

				}
				System.out.println(max);
			}
		}

		public static void main(String[] args) {
			int a[][] = {{9,6,3,5},
						 {6,5,7,8},
						 {5,6,2,5},
						 {4,5,7,9}};
			maxnumber(a);
		}
	}