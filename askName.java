import java.util.Scanner;
public class askName {
    //ask name and print hello <their name>
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = sc.next();
        System.out.println("hello " + name);
        sc.close();

    }
}
