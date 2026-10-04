import java.util.Scanner;
public class num {
    //Write a program to read a number from the user and check whether it is even or odd using the ternary operator.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i= 0;
        if(n%2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }

    }
}
