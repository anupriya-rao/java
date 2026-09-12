import java.util.Scanner;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of sub1");
        int sub1 = sc.nextInt();
        if(sub1<33){
             System.out.println("fail");
        }
        System.out.println("enter marks of sub2");
        int sub2 = sc.nextInt();
        if(sub2<33){
             System.out.println("fail");
        }
        System.out.println("enter marks of sub3");
        int sub3 = sc.nextInt();
        if(sub3<33){
             System.out.println("fail");
        }
        int total = sub1 +sub2 + sub3;
        int n = total/3 ;

        if(n<40){
            System.out.println("Fail");
        }
        else{
            System.out.println("pass");
        }

    }$
}
