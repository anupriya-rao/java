public class q9 {
    static void multiplication(int n){
        for( int i = 1 ; i<=10 ; i++){
            System.out.format("% d * %d = %d \n" , n , i , n*i);
        }
    }
    public static void main(String[] args) {
        // java program to print a multiplication table of a number n
        multiplication(7);

    }
}
