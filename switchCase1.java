import java.util.Scanner;

public class switchCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter age");
        int age = sc.nextInt();
        /*if(age<18){
            System.out.println("you can  not drive ");
        }
        else if(age<=60){
            System.out.println("you can drive ");
        }
        else if(age>=61){
            System.out.println("you are senior citizen ");
        }
        else {
            System.out.printf("you can not drive ");
        }*/
       switch(age){
        case 17 :
             System.out.println("you can not drive ");
             break;
        case 20 :
             System.out.println("you can drive ");
             break;
        case 60 :
             System.out.println("you can drive ");
             break;

       }
       

    }
}
