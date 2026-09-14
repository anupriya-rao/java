public class q3 {
    public static void main(String[] args) {
        int n = 6;
        int sum = 1;

        for(int i = n; i >0; i--){
            sum = i*sum;
        }
        System.out.println("sum of their factorial is ");
        System.out.println(sum);

    }
}
