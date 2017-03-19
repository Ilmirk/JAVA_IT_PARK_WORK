// Сделать разворот против часовой стрелки в квадратной матрице

class Program{

		public static void turn(int b[][],int d[][]){
			int i,l;			
			for (int k = 0, j = 0; k < b.length; k++, j++){ 				
				i=0;		
				for (l = b[0].length-1, i = 0; l >= 0 ; l--, i++ ) { 					
					d[i][j] = b[k][l];																	
				}				
			}		
		}
			
		public static void main(String[] args) {
        int a[][] = {{8,3,9,6},
                     {6,2,7,5},
                     {8,4,9,4},
                     {9,3,7,5}};
						 						 
			int c[][]= new int[a.length][a[0].length];
			
			turn(a,c);
			for (int i = 0; i < c.length; i++ ){	
				System.out.println();			
				for (int j = 0; j < c[0].length; j++ ){
					System.out.print(c[i][j] + " ");
				}
			}
		}
	}
