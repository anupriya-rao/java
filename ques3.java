import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        int num1 = 3;
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        if(num1 == num2 ){
            System.out.println("same");
        }
        else 
            System.out.println("not same");
        sc.close();
    }
}
