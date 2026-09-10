import java.util.Scanner;
public class cbsePercentage {
    public static void main(String[] args){
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in maths ");
        int m1 = sc.nextInt();
        System.out.println("enter marks in physics ");
        int m2 = sc.nextInt();
        System.out.println("enter marks in biology ");
        int m3 = sc.nextInt();
        System.out.println("enter marks chemistry");
        int m4 = sc.nextInt();
        System.out.println("enter marks english");
        int m5 = sc.nextInt();
        System.out.println("your total marks out of 500 are : ");
        int Sum = m1 + m2 + m3 + m4 + m5;
        System.out.print(Sum);
        System.out.println("your Percentage is :  ");
        int percentage = Sum/5;
        System.out.print(percentage);
    }

}
