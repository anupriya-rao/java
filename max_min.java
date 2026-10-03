import java.util.Scanner ;
public class max_min {
    //read n elements into array and print min and max 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : "); 
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(int i = 1 ; i<n ; i++ ){
            if(a[i] > max) 
                max = a[i];
            if(a[i] < min)
                min = a[i];
        }
            System.out.println("maximum is " + max);
            System.out.println("minimum is " + min);
    }
}
