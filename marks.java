import java.util.Scanner ; 
public class marks {
    // store marks of 5 students . display total , average and highest marks 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n : ");
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i<n ; i++){
        a[i] = sc.nextInt();
    }
    int max = 0;
    int sum = 0;
    int average = 0 ;
    for(int i = 0 ; i<n ; i++ ){
        // for sum 
        sum = sum + a[i];
        // for average 
        average = sum/n;
        // for highest 
        if(a[i]> max ){
            max = a[i];
        }

    }
    System.out.println("sum is : " + sum);
    System.out.println("average is : " + average);
    System.out.println("max number is : " + max);
    }

}
