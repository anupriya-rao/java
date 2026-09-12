import java.util.Scanner;
public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income :");
        float inc = sc.nextFloat();
        if (inc < 2.5f) {
            System.out.println("Income cannot be less than 2.5 lakh.");
        }
        else if(inc>=2.5f && inc<5.0f){
            System.out.println("5% tax shall be paid.");
        }
        else if(inc>=5.0f && inc<10.0f){
            System.out.println("20% tax shall be paid.");
        }
        else if(inc>=10.0f){
            System.out.println("30% tax shall be paid.");
        }
    }
}
