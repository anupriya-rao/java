import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        //sum of first naturam even numbers using while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int i = 1;
        int sum=0;
        while(i<=n){
            sum = sum + (2 * i);
            i++;

        }
        System.out.println("Sum = " + sum);
    }
}
