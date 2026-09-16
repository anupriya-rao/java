public class recurssion {
    //a function that can call itself 
    static int factorial(int n){
        // factorial of n = n(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 23;
        System.out.println("factorial of n is : " + factorial(n));
        
    }
}
