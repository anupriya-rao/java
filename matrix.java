public class matrix {
    //Write a program to find the sum of the diagonal elements of a 3x3 matrix.
    public static void main(String[] args) {
        int[][] arr = {{1,2,3} , {3,4,5} , {6,7,8}};
        int sum = 0;
        for(int i = 0 ; i<3 ; i++){
            sum = sum + arr[i][i];
        }
        System.out.println(sum);
    }

}
