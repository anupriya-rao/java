import java.util.Scanner;
public class numInteger {

    // is number integer or not 
    public static void main(String[] arg){
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num==(int) num){
            System.out.println("it is integer");
        }
        sc.close();


    }
}
