import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args) {
    // program to print first n natural nums using do - while loops 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    do{
        System.out.println(i);
        i++;
    }while (i <= n);

    }
}
