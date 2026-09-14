public class q7 {
    public static void main(String[] args) {
        int [] [] mat1 = {
            {1,2,3} ,  {4,5,6}
        };
        int [] [] mat2 = {
            {7,2,9} ,  {4,7,0}
        };
        int sum = 0;
        for(int i = 0 ; i<mat1.length; i++){
            for(int j = 0; j<mat2[i].length; j++){
                System.out.print(mat1[i][j] + mat2[i][j] + " " );
            }
            System.out.println();
        }
    }
}
