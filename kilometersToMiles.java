import java.util.Scanner;

public class kilometersToMiles {
    public static void main(String[] args){
        //convert kilometers to miles
        System.out.println("enter your kilometers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float miles = n*0.62f ;
        System.out.println(miles + "miles");
        sc.close();

    }
}
