import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you can drive ");
        }
        else {
            System.out.printf("you can not drive ");
        }

    }
}
