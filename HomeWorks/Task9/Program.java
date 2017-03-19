//Найти минимальный элемент в каждой строке матрицы

class Program{

	public static void min(int b[][]){
		int minNum = 0;			
		for (int i = 0;i < b.length;i++){
			minNum = b[i][0];
			for (int j = 0; j < b[0].length-1; j++){					
				if (b[i][j] < minNum){
					minNum = b[i][j];
				}					
			}				
				System.out.println(minNum);
			}			
		}
			
	public static void main(String[] args) {
		int a[][] = {{7,2,5},
					 {8,4,6},
					 {0,4,3},
					 {9,8,8}};	
	min(a);
	}
}

