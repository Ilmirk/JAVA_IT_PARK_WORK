// Обнулить все элементы на побочной диагонали

class Program{

    public static void diagonal(int b[][]){
        int j=0;
        for (int i = b.length-1; i >= 0; i-- ){
            if(j < b[0].length){
                b[i][j] = 0;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = {{8,3,9,6},
                     {6,2,7,5},
                     {8,4,9,4},
                     {9,3,7,5}};
        diagonal(a);
        for (int i = 0; i < a.length; i++ ){
            System.out.println();
            for (int j = 0; j < a[0].length; j++ ){
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
