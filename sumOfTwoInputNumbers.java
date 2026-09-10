import java.util.Scanner;
public class sumOfTwoInputNumbers {
   public static void main(String[] args){
    System.out.println("taking input");
    Scanner num = new Scanner(System.in);
    System.out.println("enter num1");
    int a = num.nextInt();
    System.out.println("enter num2");
    int b = num.nextInt();
    int sum = a+b ;
    System.out.println("their sum is ");
    System.out.println(sum);



    /*System.out.println("Sum of these numbers :");
    int num1 = 5;
    int num2 = 8;
    int num3 = 45;
    int sum = num3+num2+num1;
    System.out.println(sum);*/
   }
}
