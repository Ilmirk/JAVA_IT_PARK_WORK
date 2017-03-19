// Обнулить все элементы главной диагонали квадратной матрицы

class Program{

    public static void diagonal(int b[][]){

        for (int i = 0; i < b.length; i++ ){
            for (int j = 0; j < b[0].length; j++ ){
                if (i == j)
                    b[i][j] = 0;

            }
        }
    }

    public static void main(String[] args) {
        int a[][] = {{8,3,9,6},
                     {6,2,7,5},
                     {8,4,0,4},
                     {9,3,7,5}};
        diagonal(a);
        System.out.println("diagonal = 0");
        for (int i = 0; i < a.length; i++){
            System.out.println();
            for (int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
